package com.robinhood.shared.crypto.transfer.enrollment.valueProps.loading;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Property;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.transition.Interpolators;
import com.robinhood.android.regiongate.CryptoRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.shared.crypto.transfer.C37934R;
import com.robinhood.shared.crypto.transfer.databinding.FragmentWalletEnrollmentLoadingBinding;
import com.robinhood.shared.crypto.transfer.enrollment.navigation.EnrollmentEvent;
import com.robinhood.shared.crypto.transfer.enrollment.navigation.EnrollmentEventReceiver;
import com.robinhood.shared.crypto.transfer.enrollment.valueProps.loading.WalletEnrollmentLoadingViewState;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCompanion;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: WalletEnrollmentLoadingFragment.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 .2\u00020\u00012\u00020\u0002:\u0001.B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010 \u001a\u00020\u001bH\u0016J\u0016\u0010!\u001a\u00020\u001b2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#H\u0002J\u0010\u0010%\u001a\u00020\u001b2\u0006\u0010&\u001a\u00020'H\u0016J\t\u0010(\u001a\u00020\u0006H\u0096\u0001R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*X\u0096\u0005¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u0006/"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/enrollment/valueProps/loading/WalletEnrollmentLoadingFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "toolbarVisible", "", "getToolbarVisible", "()Z", "duxo", "Lcom/robinhood/shared/crypto/transfer/enrollment/valueProps/loading/WalletEnrollmentLoadingDuxo;", "getDuxo", "()Lcom/robinhood/shared/crypto/transfer/enrollment/valueProps/loading/WalletEnrollmentLoadingDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "bindings", "Lcom/robinhood/shared/crypto/transfer/databinding/FragmentWalletEnrollmentLoadingBinding;", "getBindings", "()Lcom/robinhood/shared/crypto/transfer/databinding/FragmentWalletEnrollmentLoadingBinding;", "bindings$delegate", "Lkotlin/properties/ReadOnlyProperty;", "eventReceiver", "Lcom/robinhood/shared/crypto/transfer/enrollment/navigation/EnrollmentEventReceiver;", "getEventReceiver", "()Lcom/robinhood/shared/crypto/transfer/enrollment/navigation/EnrollmentEventReceiver;", "eventReceiver$delegate", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onDownloadCompleted", "files", "", "Landroid/net/Uri;", "onDialogDismissed", "id", "", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class WalletEnrollmentLoadingFragment extends BaseFragment implements RegionGated {
    private static final long ANIMATION_TRANSITION_DURATION = 333;
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: bindings$delegate, reason: from kotlin metadata */
    private final Interfaces2 bindings;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;

    /* renamed from: eventReceiver$delegate, reason: from kotlin metadata */
    private final Interfaces2 eventReceiver;
    private final boolean toolbarVisible;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(WalletEnrollmentLoadingFragment.class, "bindings", "getBindings()Lcom/robinhood/shared/crypto/transfer/databinding/FragmentWalletEnrollmentLoadingBinding;", 0)), Reflection.property1(new PropertyReference1Impl(WalletEnrollmentLoadingFragment.class, "eventReceiver", "getEventReceiver()Lcom/robinhood/shared/crypto/transfer/enrollment/navigation/EnrollmentEventReceiver;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    public WalletEnrollmentLoadingFragment() {
        super(C37934R.layout.fragment_wallet_enrollment_loading);
        this.$$delegate_0 = new RegionGated2(CryptoRegionGate.INSTANCE);
        this.duxo = OldDuxos.oldDuxo(this, WalletEnrollmentLoadingDuxo.class);
        this.bindings = ViewBinding5.viewBinding(this, WalletEnrollmentLoadingFragment2.INSTANCE);
        this.eventReceiver = new CallbacksProperty(Reflection.getOrCreateKotlinClass(EnrollmentEventReceiver.class), new Function1<Fragment, Object>() { // from class: com.robinhood.shared.crypto.transfer.enrollment.valueProps.loading.WalletEnrollmentLoadingFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    private final WalletEnrollmentLoadingDuxo getDuxo() {
        return (WalletEnrollmentLoadingDuxo) this.duxo.getValue();
    }

    private final FragmentWalletEnrollmentLoadingBinding getBindings() {
        Object value = this.bindings.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentWalletEnrollmentLoadingBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EnrollmentEventReceiver getEventReceiver() {
        return (EnrollmentEventReceiver) this.eventReceiver.getValue(this, $$delegatedProperties[1]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        WalletEnrollmentLoadingDuxo duxo = getDuxo();
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        duxo.startDownloading(context);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.shared.crypto.transfer.enrollment.valueProps.loading.WalletEnrollmentLoadingFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return WalletEnrollmentLoadingFragment.onStart$lambda$0(this.f$0, (WalletEnrollmentLoadingViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$0(WalletEnrollmentLoadingFragment walletEnrollmentLoadingFragment, WalletEnrollmentLoadingViewState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        walletEnrollmentLoadingFragment.getBindings().loadingProgressBar.setSpeed(state.getPlaySpeed());
        if (state instanceof WalletEnrollmentLoadingViewState.Downloading) {
            if (((WalletEnrollmentLoadingViewState.Downloading) state).getStartPlaying()) {
                walletEnrollmentLoadingFragment.getBindings().loadingProgressBar.playAnimation();
            }
        } else if (state instanceof WalletEnrollmentLoadingViewState.Completed) {
            walletEnrollmentLoadingFragment.onDownloadCompleted(((WalletEnrollmentLoadingViewState.Completed) state).getFiles());
        } else {
            if (!(state instanceof WalletEnrollmentLoadingViewState.Failed)) {
                throw new NoWhenBranchMatchedException();
            }
            walletEnrollmentLoadingFragment.onDownloadCompleted(CollectionsKt.emptyList());
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13, types: [android.animation.Animator$AnimatorListener, com.robinhood.shared.crypto.transfer.enrollment.valueProps.loading.WalletEnrollmentLoadingFragment$onDownloadCompleted$1$listener$1] */
    private final void onDownloadCompleted(final List<? extends Uri> files) {
        getBindings().rootView.setPivotX(getBindings().rootView.getWidth() / 2.0f);
        getBindings().rootView.setPivotY(getBindings().rootView.getHeight() / 2.0f);
        final AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(getBindings().rootView, (Property<ConstraintLayout, Float>) View.SCALE_X, 1.1f);
        objectAnimatorOfFloat.setDuration(ANIMATION_TRANSITION_DURATION);
        Interpolators interpolators = Interpolators.INSTANCE;
        objectAnimatorOfFloat.setInterpolator(interpolators.getDefaultCurveInterpolator());
        Unit unit = Unit.INSTANCE;
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(getBindings().rootView, (Property<ConstraintLayout, Float>) View.SCALE_Y, 1.1f);
        objectAnimatorOfFloat2.setDuration(ANIMATION_TRANSITION_DURATION);
        objectAnimatorOfFloat2.setInterpolator(interpolators.getDefaultCurveInterpolator());
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(getBindings().rootView, (Property<ConstraintLayout, Float>) View.ALPHA, 1.0f, 0.0f);
        objectAnimatorOfFloat3.setDuration(ANIMATION_TRANSITION_DURATION);
        objectAnimatorOfFloat3.setInterpolator(interpolators.getDefaultCurveInterpolator());
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3);
        final ?? r1 = new AnimatorListenerAdapter() { // from class: com.robinhood.shared.crypto.transfer.enrollment.valueProps.loading.WalletEnrollmentLoadingFragment$onDownloadCompleted$1$listener$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                this.this$0.getEventReceiver().onEvent(new EnrollmentEvent.IntroLoaded(files));
            }
        };
        animatorSet.addListener(r1);
        final ConstraintLayout rootView = getBindings().rootView;
        Intrinsics.checkNotNullExpressionValue(rootView, "rootView");
        if (!rootView.isAttachedToWindow()) {
            animatorSet.removeListener(r1);
        } else {
            rootView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.robinhood.shared.crypto.transfer.enrollment.valueProps.loading.WalletEnrollmentLoadingFragment$onDownloadCompleted$lambda$5$$inlined$doOnDetach$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view) {
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view) {
                    rootView.removeOnAttachStateChangeListener(this);
                    animatorSet.removeListener(r1);
                }
            });
        }
        animatorSet.start();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnDismissListener
    public void onDialogDismissed(int id) {
        if (id == C37934R.id.dialog_id_wallet_enrollment_loading_error) {
            requireActivity().finish();
        } else {
            super.onDialogDismissed(id);
        }
    }

    /* compiled from: WalletEnrollmentLoadingFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/enrollment/valueProps/loading/WalletEnrollmentLoadingFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithoutArgsCompanion;", "Lcom/robinhood/shared/crypto/transfer/enrollment/valueProps/loading/WalletEnrollmentLoadingFragment;", "<init>", "()V", "ANIMATION_TRANSITION_DURATION", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithoutArgsCompanion<WalletEnrollmentLoadingFragment> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public /* bridge */ /* synthetic */ Parcelable getArgs(Fragment fragment) {
            return (Parcelable) getArgs((WalletEnrollmentLoadingFragment) fragment);
        }

        public Void getArgs(WalletEnrollmentLoadingFragment walletEnrollmentLoadingFragment) {
            return FragmentWithoutArgsCompanion.DefaultImpls.getArgs(this, walletEnrollmentLoadingFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCreator
        public WalletEnrollmentLoadingFragment newInstance() {
            return (WalletEnrollmentLoadingFragment) FragmentWithoutArgsCompanion.DefaultImpls.newInstance(this);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCreator
        public WalletEnrollmentLoadingFragment newInstance(Void r1) {
            return (WalletEnrollmentLoadingFragment) FragmentWithoutArgsCompanion.DefaultImpls.newInstance(this, r1);
        }
    }
}
