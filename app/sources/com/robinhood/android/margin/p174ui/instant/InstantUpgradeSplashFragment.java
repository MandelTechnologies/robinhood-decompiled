package com.robinhood.android.margin.p174ui.instant;

import android.content.Context;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.airbnb.lottie.LottieAnimationView;
import com.robinhood.android.common.p088ui.NoTitleToolbarFragment;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.extensions.TextViewsKt;
import com.robinhood.android.common.util.text.ActionSpan;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.margin.C20999R;
import com.robinhood.android.margin.databinding.FragmentInstantUpgradeSplashBinding;
import com.robinhood.android.margin.p174ui.instant.InstantUpgradeSplashDuxo2;
import com.robinhood.android.margin.p174ui.instant.InstantUpgradeSplashFragment;
import com.robinhood.android.regiongate.InstantDepositRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.util.extensions.LottieAnimationViewsKt;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.shared.remote.assets.LottieUrl;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import io.reactivex.Observable;
import java.util.NoSuchElementException;
import java.util.Set;
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

/* compiled from: InstantUpgradeSplashFragment.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 +2\u00020\u00012\u00020\u0002:\u0002*+B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u001a\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u0017H\u0016J\u0010\u0010 \u001a\u00020\u00172\u0006\u0010!\u001a\u00020\"H\u0002J\t\u0010#\u001a\u00020$H\u0096\u0001R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\n\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&X\u0096\u0005¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006,"}, m3636d2 = {"Lcom/robinhood/android/margin/ui/instant/InstantUpgradeSplashFragment;", "Lcom/robinhood/android/common/ui/NoTitleToolbarFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "binding", "Lcom/robinhood/android/margin/databinding/FragmentInstantUpgradeSplashBinding;", "getBinding", "()Lcom/robinhood/android/margin/databinding/FragmentInstantUpgradeSplashBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/margin/ui/instant/InstantUpgradeSplashDuxo;", "getDuxo", "()Lcom/robinhood/android/margin/ui/instant/InstantUpgradeSplashDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "callbacks", "Lcom/robinhood/android/margin/ui/instant/InstantUpgradeSplashFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/margin/ui/instant/InstantUpgradeSplashFragment$Callbacks;", "callbacks$delegate", "onAttach", "", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "renderState", "state", "Lcom/robinhood/android/margin/ui/instant/InstantUpgradeSplashState;", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Companion", "feature-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class InstantUpgradeSplashFragment extends NoTitleToolbarFragment implements RegionGated {
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(InstantUpgradeSplashFragment.class, "binding", "getBinding()Lcom/robinhood/android/margin/databinding/FragmentInstantUpgradeSplashBinding;", 0)), Reflection.property1(new PropertyReference1Impl(InstantUpgradeSplashFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/margin/ui/instant/InstantUpgradeSplashFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: InstantUpgradeSplashFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/margin/ui/instant/InstantUpgradeSplashFragment$Callbacks;", "", "onUpgradeNowClicked", "", "onLearnMoreClicked", "referralUrl", "", "feature-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onLearnMoreClicked(String referralUrl);

        void onUpgradeNowClicked();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    public InstantUpgradeSplashFragment() {
        super(C20999R.layout.fragment_instant_upgrade_splash);
        this.$$delegate_0 = new RegionGated2(InstantDepositRegionGate.INSTANCE);
        this.binding = ViewBinding5.viewBinding(this, InstantUpgradeSplashFragment2.INSTANCE);
        this.duxo = OldDuxos.oldDuxo(this, InstantUpgradeSplashDuxo.class);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.margin.ui.instant.InstantUpgradeSplashFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof InstantUpgradeSplashFragment.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
    }

    private final FragmentInstantUpgradeSplashBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentInstantUpgradeSplashBinding) value;
    }

    private final InstantUpgradeSplashDuxo getDuxo() {
        return (InstantUpgradeSplashDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        if (context instanceof Callbacks) {
            return;
        }
        throw new IllegalArgumentException((context + " must implement " + Callbacks.class.getName()).toString());
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26663applyWindowInsetsAsMarginqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        LottieAnimationView lottieAnimationView = getBinding().animationView;
        Intrinsics.checkNotNull(lottieAnimationView);
        LottieAnimationViewsKt.setRemoteUrl(lottieAnimationView, LottieUrl.INSTANT_BOLT);
        LottieAnimationViewsKt.addEndingInfiniteLoop(lottieAnimationView, 83, 788);
        RdsButton positiveBtn = getBinding().positiveBtn;
        Intrinsics.checkNotNullExpressionValue(positiveBtn, "positiveBtn");
        OnClickListeners.onClick(positiveBtn, new Function0() { // from class: com.robinhood.android.margin.ui.instant.InstantUpgradeSplashFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InstantUpgradeSplashFragment.onViewCreated$lambda$1(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(InstantUpgradeSplashFragment instantUpgradeSplashFragment) {
        instantUpgradeSplashFragment.getCallbacks().onUpgradeNowClicked();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        Observable<InstantUpgradeSplashDuxo2> observableDistinctUntilChanged = getDuxo().getStates().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C210761(this));
    }

    /* compiled from: InstantUpgradeSplashFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.margin.ui.instant.InstantUpgradeSplashFragment$onResume$1 */
    /* synthetic */ class C210761 extends FunctionReferenceImpl implements Function1<InstantUpgradeSplashDuxo2, Unit> {
        C210761(Object obj) {
            super(1, obj, InstantUpgradeSplashFragment.class, "renderState", "renderState(Lcom/robinhood/android/margin/ui/instant/InstantUpgradeSplashState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InstantUpgradeSplashDuxo2 instantUpgradeSplashDuxo2) {
            invoke2(instantUpgradeSplashDuxo2);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(InstantUpgradeSplashDuxo2 p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((InstantUpgradeSplashFragment) this.receiver).renderState(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderState(final InstantUpgradeSplashDuxo2 state) {
        if (state instanceof InstantUpgradeSplashDuxo2.ShowInstantSplash) {
            ShimmerLoadingView loadingView = getBinding().loadingView;
            Intrinsics.checkNotNullExpressionValue(loadingView, "loadingView");
            loadingView.setVisibility(8);
            RhTextView descriptionTxt = getBinding().descriptionTxt;
            Intrinsics.checkNotNullExpressionValue(descriptionTxt, "descriptionTxt");
            String string2 = ViewsKt.getString(descriptionTxt, C20999R.string.robinhood_instant_summary);
            num = num.intValue() == 0 ? null : 0;
            TextViewsKt.setTextWithLearnMore((TextView) descriptionTxt, (CharSequence) string2, false, false, num != null ? ViewsKt.getString(descriptionTxt, num.intValue()) : null, (ClickableSpan) new ActionSpan(false, (Function0) new Function0<Unit>() { // from class: com.robinhood.android.margin.ui.instant.InstantUpgradeSplashFragment$renderState$$inlined$setTextWithLearnMore$default$1
                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.this$0.getCallbacks().onLearnMoreClicked(((InstantUpgradeSplashDuxo2.ShowInstantSplash) state).getReferralCode().getUrl());
                }
            }, 1, (DefaultConstructorMarker) null));
            if (getBinding().animationView.isAnimating()) {
                return;
            }
            getBinding().animationView.playAnimation();
            return;
        }
        if (state instanceof InstantUpgradeSplashDuxo2.Error) {
            Throwable thConsume = ((InstantUpgradeSplashDuxo2.Error) state).getInstantReferralCodeErrorEvent().consume();
            if (thConsume != null) {
                AbsErrorHandler.handleError$default(getActivityErrorHandler(), thConsume, false, 2, null);
                return;
            }
            return;
        }
        if (!(state instanceof InstantUpgradeSplashDuxo2.Loading)) {
            throw new NoWhenBranchMatchedException();
        }
        ShimmerLoadingView loadingView2 = getBinding().loadingView;
        Intrinsics.checkNotNullExpressionValue(loadingView2, "loadingView");
        loadingView2.setVisibility(0);
    }

    /* compiled from: InstantUpgradeSplashFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/margin/ui/instant/InstantUpgradeSplashFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/robinhood/android/margin/ui/instant/InstantUpgradeSplashFragment;", "feature-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final InstantUpgradeSplashFragment newInstance() {
            return new InstantUpgradeSplashFragment();
        }
    }
}
