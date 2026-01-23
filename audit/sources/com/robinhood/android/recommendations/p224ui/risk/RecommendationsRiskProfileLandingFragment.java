package com.robinhood.android.recommendations.p224ui.risk;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.transition.TransitionSet;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.core.view.OneShotPreDrawListener;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.airbnb.lottie.LottieAnimationView;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.daynight.DayNightChanges;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.extensions.BaseFragments2;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.recommendations.C25978R;
import com.robinhood.android.recommendations.databinding.FragmentRecommendationsRiskProfileLandingBinding;
import com.robinhood.android.recommendations.p224ui.confirmation.RecommendationsQuestionnaireConfirmationFragment;
import com.robinhood.android.recommendations.p224ui.risk.RecommendationsRiskProfileLandingFragment;
import com.robinhood.android.recommendations.p224ui.utils.Constants;
import com.robinhood.android.recommendations.p224ui.utils.UtilsKt;
import com.robinhood.android.util.extensions.LottieAnimationViewsKt;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.recommendations.models.p363ui.UiRecommendationsRiskProfile;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.remote.assets.LottieUrl;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;

/* compiled from: RecommendationsRiskProfileLandingFragment.kt */
@Metadata(m3635d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 K2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0003IJKB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u000101H\u0016J\b\u00102\u001a\u00020/H\u0016J\u001a\u00103\u001a\u00020/2\u0006\u00104\u001a\u00020\u001b2\b\u00100\u001a\u0004\u0018\u000101H\u0016J\u0010\u00105\u001a\u00020/2\u0006\u00106\u001a\u000207H\u0002J\u0010\u00108\u001a\u00020/2\u0006\u00109\u001a\u00020:H\u0002J\u0018\u0010;\u001a\u00020/2\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?H\u0002J\u0018\u0010@\u001a\u00020/2\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020DH\u0016J\b\u0010E\u001a\u00020/H\u0016J\u001a\u0010F\u001a\u00020 2\u0006\u0010G\u001a\u00020?2\b\u0010H\u001a\u0004\u0018\u000101H\u0016R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R&\u0010\u0018\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001a0\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR+\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020 8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020)X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020 X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b-\u0010#¨\u0006L"}, m3636d2 = {"Lcom/robinhood/android/recommendations/ui/risk/RecommendationsRiskProfileLandingFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "Lcom/robinhood/android/common/ui/RhDialogFragment$OnClickListener;", "Lcom/robinhood/android/recommendations/ui/confirmation/RecommendationsQuestionnaireConfirmationFragment$Callbacks;", "<init>", "()V", "binding", "Lcom/robinhood/android/recommendations/databinding/FragmentRecommendationsRiskProfileLandingBinding;", "getBinding", "()Lcom/robinhood/android/recommendations/databinding/FragmentRecommendationsRiskProfileLandingBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "callbacks", "Lcom/robinhood/android/recommendations/ui/risk/RecommendationsRiskProfileLandingFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/recommendations/ui/risk/RecommendationsRiskProfileLandingFragment$Callbacks;", "callbacks$delegate", "duxo", "Lcom/robinhood/android/recommendations/ui/risk/RecommendationsRiskProfileLandingDuxo;", "getDuxo", "()Lcom/robinhood/android/recommendations/ui/risk/RecommendationsRiskProfileLandingDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "sharedElementsList", "", "Lkotlin/Pair;", "Landroid/view/View;", "", "getSharedElementsList", "()Ljava/util/List;", "<set-?>", "", "atLeastOneLoopComplete", "getAtLeastOneLoopComplete", "()Z", "setAtLeastOneLoopComplete", "(Z)V", "atLeastOneLoopComplete$delegate", "Lkotlin/properties/ReadWriteProperty;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "excludeFromAutoScreenDisappearEventLogging", "getExcludeFromAutoScreenDisappearEventLogging", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onViewCreated", "view", "setLoaderScale", "scale", "", "setViewState", "viewState", "Lcom/robinhood/android/recommendations/ui/risk/RecommendationsRiskProfileLandingViewState;", "prefetchRiskToWalkthroughLottie", "context", "Landroid/content/Context;", "volatilityTarget", "", "onAnswersConfirmed", "submissionId", "Ljava/util/UUID;", "riskProfile", "Lcom/robinhood/recommendations/models/ui/UiRecommendationsRiskProfile;", "onAnswersNotConfirmed", "onPositiveButtonClicked", "id", "passthroughArgs", "Callbacks", "Args", "Companion", "feature-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class RecommendationsRiskProfileLandingFragment extends BaseFragment implements AutoLoggableFragment, RhDialogFragment.OnClickListener, RecommendationsQuestionnaireConfirmationFragment.Callbacks {
    private static final String BACKGROUND_TRANSITION_NAME = "background_shared_element";
    private static final String CONTINUE_BTN_TRANSITION_NAME = "continue_btn_shared_element";
    private static final int LOTTIE_DROP_DOWN_END_FRAME = 40;
    private static final int LOTTIE_DROP_DOWN_START_FRAME = 0;
    private static final int LOTTIE_END_FRAME = 140;
    private static final int LOTTIE_SCALE_END_FRAME = 30;
    private static final float STARTING_SCALE = 0.4f;

    /* renamed from: atLeastOneLoopComplete$delegate, reason: from kotlin metadata */
    private final Interfaces3 atLeastOneLoopComplete;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    private final Screen eventScreen;
    private final boolean excludeFromAutoScreenDisappearEventLogging;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RecommendationsRiskProfileLandingFragment.class, "binding", "getBinding()Lcom/robinhood/android/recommendations/databinding/FragmentRecommendationsRiskProfileLandingBinding;", 0)), Reflection.property1(new PropertyReference1Impl(RecommendationsRiskProfileLandingFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/recommendations/ui/risk/RecommendationsRiskProfileLandingFragment$Callbacks;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(RecommendationsRiskProfileLandingFragment.class, "atLeastOneLoopComplete", "getAtLeastOneLoopComplete()Z", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: RecommendationsRiskProfileLandingFragment.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J2\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0018\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n0\tH&¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/recommendations/ui/risk/RecommendationsRiskProfileLandingFragment$Callbacks;", "", "startRiskProfile", "", "submissionId", "Ljava/util/UUID;", "riskProfile", "Lcom/robinhood/recommendations/models/ui/UiRecommendationsRiskProfile;", "sharedElements", "", "Lkotlin/Pair;", "Landroid/view/View;", "", "feature-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void startRiskProfile(UUID submissionId, UiRecommendationsRiskProfile riskProfile, List<? extends Tuples2<? extends View, String>> sharedElements);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenAppearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenAppearEventLogging(this);
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

    public RecommendationsRiskProfileLandingFragment() {
        super(C25978R.layout.fragment_recommendations_risk_profile_landing);
        this.binding = ViewBinding5.viewBinding(this, RecommendationsRiskProfileLandingFragment2.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.recommendations.ui.risk.RecommendationsRiskProfileLandingFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (android.content.Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof RecommendationsRiskProfileLandingFragment.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
        this.duxo = OldDuxos.oldDuxo(this, RecommendationsRiskProfileLandingDuxo.class);
        this.atLeastOneLoopComplete = BindSavedState2.savedBoolean(this, false).provideDelegate(this, $$delegatedProperties[2]);
        this.eventScreen = new Screen(Screen.Name.RECS_RISK_LOADER, null, null, null, 14, null);
        this.excludeFromAutoScreenDisappearEventLogging = true;
    }

    private final FragmentRecommendationsRiskProfileLandingBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentRecommendationsRiskProfileLandingBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    private final RecommendationsRiskProfileLandingDuxo getDuxo() {
        return (RecommendationsRiskProfileLandingDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<Tuples2<View, String>> getSharedElementsList() {
        return CollectionsKt.listOf((Object[]) new Tuples2[]{Tuples4.m3642to(getBinding().sharedElementLottie, getBinding().sharedElementLottie.getTransitionName()), Tuples4.m3642to(getBinding().background, getBinding().background.getTransitionName()), Tuples4.m3642to(getBinding().continueBtn, getBinding().continueBtn.getTransitionName())});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getAtLeastOneLoopComplete() {
        return ((Boolean) this.atLeastOneLoopComplete.getValue(this, $$delegatedProperties[2])).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setAtLeastOneLoopComplete(boolean z) {
        this.atLeastOneLoopComplete.setValue(this, $$delegatedProperties[2], Boolean.valueOf(z));
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return this.eventScreen;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenDisappearEventLogging() {
        return this.excludeFromAutoScreenDisappearEventLogging;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setSharedElementEnterTransition(new TransitionSet());
        setSharedElementReturnTransition(new TransitionSet());
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C261761(this));
    }

    /* compiled from: RecommendationsRiskProfileLandingFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.recommendations.ui.risk.RecommendationsRiskProfileLandingFragment$onStart$1 */
    /* synthetic */ class C261761 extends FunctionReferenceImpl implements Function1<RecommendationsRiskProfileLandingViewState, Unit> {
        C261761(Object obj) {
            super(1, obj, RecommendationsRiskProfileLandingFragment.class, "setViewState", "setViewState(Lcom/robinhood/android/recommendations/ui/risk/RecommendationsRiskProfileLandingViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RecommendationsRiskProfileLandingViewState recommendationsRiskProfileLandingViewState) throws Throwable {
            invoke2(recommendationsRiskProfileLandingViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(RecommendationsRiskProfileLandingViewState p0) throws Throwable {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((RecommendationsRiskProfileLandingFragment) this.receiver).setViewState(p0);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        postponeEnterTransition();
        final FragmentRecommendationsRiskProfileLandingBinding binding = getBinding();
        MotionLayout root = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        BaseFragments2.setContentBelowToolbar(this, root);
        binding.sharedElementLottie.setTransitionName(Constants.RECS_MAIN_SHARED_LOTTIE_TRANSITION_NAME);
        binding.background.setTransitionName(BACKGROUND_TRANSITION_NAME);
        binding.continueBtn.setTransitionName(CONTINUE_BTN_TRANSITION_NAME);
        final LottieAnimationView sharedElementLottie = binding.sharedElementLottie;
        Intrinsics.checkNotNullExpressionValue(sharedElementLottie, "sharedElementLottie");
        OneShotPreDrawListener.add(sharedElementLottie, new Runnable() { // from class: com.robinhood.android.recommendations.ui.risk.RecommendationsRiskProfileLandingFragment$onViewCreated$lambda$3$$inlined$doOnPreDraw$1
            @Override // java.lang.Runnable
            public final void run() {
                this.startPostponedEnterTransition();
            }
        });
        final LottieAnimationView lottieAnimationView = binding.sharedElementLottie;
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(requireBaseActivity().getDayNightStyleChanges()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.recommendations.ui.risk.RecommendationsRiskProfileLandingFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecommendationsRiskProfileLandingFragment.onViewCreated$lambda$3$lambda$2$lambda$1(lottieAnimationView, (DayNightOverlay) obj);
            }
        });
        lottieAnimationView.setMinAndMaxFrame(0, 40);
        lottieAnimationView.addAnimatorListener(new AnimatorListenerAdapter() { // from class: com.robinhood.android.recommendations.ui.risk.RecommendationsRiskProfileLandingFragment$onViewCreated$1$2$2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                binding.motionLayout.transitionToEnd();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                Intrinsics.checkNotNullParameter(animator, "animator");
                lottieAnimationView.removeAnimatorListener(this);
                lottieAnimationView.removeAllUpdateListeners();
                lottieAnimationView.setMinAndMaxFrame(40, EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_RED_VALUE);
                lottieAnimationView.setRepeatMode(1);
                lottieAnimationView.setRepeatCount(-1);
                lottieAnimationView.playAnimation();
            }
        });
        lottieAnimationView.addAnimatorUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.robinhood.android.recommendations.ui.risk.RecommendationsRiskProfileLandingFragment$onViewCreated$1$2$3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator animator) {
                Intrinsics.checkNotNullParameter(animator, "animator");
                this.this$0.setLoaderScale(Math.min(1.0f, (((animator.getAnimatedFraction() * 0.6f) * 40) / 30.0f) + 0.4f));
            }
        });
        lottieAnimationView.playAnimation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$3$lambda$2$lambda$1(LottieAnimationView lottieAnimationView, DayNightOverlay it) {
        Intrinsics.checkNotNullParameter(it, "it");
        LottieUrl lottieUrl = DayNightChanges.isDay(it) ? LottieUrl.RECS_RISK_LOADER_DAY : LottieUrl.RECS_RISK_LOADER_NIGHT;
        Intrinsics.checkNotNull(lottieAnimationView);
        LottieAnimationViewsKt.setRemoteUrl(lottieAnimationView, lottieUrl);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setLoaderScale(float scale) {
        getBinding().sharedElementLottie.setScaleX(scale);
        getBinding().sharedElementLottie.setScaleY(scale);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setViewState(RecommendationsRiskProfileLandingViewState viewState) throws Throwable {
        Throwable thConsume;
        UiEvent<Throwable> errorEvent = viewState.getErrorEvent();
        if (errorEvent != null && (thConsume = errorEvent.consume()) != null) {
            ActivityErrorHandler.Companion companion = ActivityErrorHandler.INSTANCE;
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            ActivityErrorHandler.Companion.handle$default(companion, fragmentActivityRequireActivity, thConsume, true, false, C25978R.id.dialog_id_risk_landing_network_error_alert, null, 40, null);
        }
        final UiRecommendationsRiskProfile riskProfile = viewState.getRiskProfile();
        if (riskProfile != null) {
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            prefetchRiskToWalkthroughLottie(contextRequireContext, riskProfile.getVolatilityTarget());
            final LottieAnimationView lottieAnimationView = getBinding().sharedElementLottie;
            lottieAnimationView.addAnimatorListener(new AnimatorListenerAdapter() { // from class: com.robinhood.android.recommendations.ui.risk.RecommendationsRiskProfileLandingFragment$setViewState$2$1$1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                    Intrinsics.checkNotNullParameter(animator, "animator");
                    lottieAnimationView.setMinAndMaxFrame(40, UtilsKt.getRiskBucketPauseFrame(riskProfile.getVolatilityTarget()));
                    lottieAnimationView.setRepeatCount(0);
                    lottieAnimationView.playAnimation();
                    this.setAtLeastOneLoopComplete(true);
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animation) {
                    Intrinsics.checkNotNullParameter(animation, "animation");
                    if (this.getAtLeastOneLoopComplete()) {
                        if (riskProfile.getConfirmationPage() != null) {
                            RecommendationsRiskProfileLandingFragment.Companion companion2 = RecommendationsRiskProfileLandingFragment.INSTANCE;
                            if (!((RecommendationsRiskProfileLandingFragment.Args) companion2.getArgs((Fragment) this)).getSkipConfirmationScreen()) {
                                RecommendationsQuestionnaireConfirmationFragment recommendationsQuestionnaireConfirmationFragment = (RecommendationsQuestionnaireConfirmationFragment) RecommendationsQuestionnaireConfirmationFragment.INSTANCE.newInstance((Parcelable) new RecommendationsQuestionnaireConfirmationFragment.Args(riskProfile, ((RecommendationsRiskProfileLandingFragment.Args) companion2.getArgs((Fragment) this)).getSubmissionId()));
                                FragmentManager childFragmentManager = this.getChildFragmentManager();
                                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                                recommendationsQuestionnaireConfirmationFragment.show(childFragmentManager, "recs-questionnaire-confirmation");
                                return;
                            }
                        }
                        this.getCallbacks().startRiskProfile(((RecommendationsRiskProfileLandingFragment.Args) RecommendationsRiskProfileLandingFragment.INSTANCE.getArgs((Fragment) this)).getSubmissionId(), riskProfile, this.getSharedElementsList());
                    }
                }
            });
        }
    }

    private final void prefetchRiskToWalkthroughLottie(final android.content.Context context, final int volatilityTarget) {
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(requireBaseActivity().getDayNightStyleChanges()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.recommendations.ui.risk.RecommendationsRiskProfileLandingFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecommendationsRiskProfileLandingFragment.prefetchRiskToWalkthroughLottie$lambda$7(volatilityTarget, context, (DayNightOverlay) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit prefetchRiskToWalkthroughLottie$lambda$7(int i, android.content.Context context, DayNightOverlay dayNightOverlay) {
        Intrinsics.checkNotNullParameter(dayNightOverlay, "dayNightOverlay");
        RiskLoaderLottieUtils.getRiskToPortfolioLottieUrl(i, dayNightOverlay).prefetch(context);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.recommendations.ui.confirmation.RecommendationsQuestionnaireConfirmationFragment.Callbacks
    public void onAnswersConfirmed(UUID submissionId, UiRecommendationsRiskProfile riskProfile) {
        Intrinsics.checkNotNullParameter(submissionId, "submissionId");
        Intrinsics.checkNotNullParameter(riskProfile, "riskProfile");
        getCallbacks().startRiskProfile(((Args) INSTANCE.getArgs((Fragment) this)).getSubmissionId(), riskProfile, getSharedElementsList());
    }

    @Override // com.robinhood.android.recommendations.ui.confirmation.RecommendationsQuestionnaireConfirmationFragment.Callbacks
    public void onAnswersNotConfirmed() {
        requireActivity().onBackPressed();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onPositiveButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C25978R.id.dialog_id_risk_landing_network_error_alert) {
            requireActivity().onBackPressed();
            return true;
        }
        return super.onPositiveButtonClicked(id, passthroughArgs);
    }

    /* compiled from: RecommendationsRiskProfileLandingFragment.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0018\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00040\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00040\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J9\u0010\u0014\u001a\u00020\u00002\u001a\b\u0002\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0006\u0010\u0015\u001a\u00020\u0016J\u0013\u0010\u0017\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0016R#\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/recommendations/ui/risk/RecommendationsRiskProfileLandingFragment$Args;", "Landroid/os/Parcelable;", "questionsAndAnswers", "", "Lkotlin/Pair;", "Ljava/util/UUID;", "submissionId", "skipConfirmationScreen", "", "<init>", "(Ljava/util/List;Ljava/util/UUID;Z)V", "getQuestionsAndAnswers", "()Ljava/util/List;", "getSubmissionId", "()Ljava/util/UUID;", "getSkipConfirmationScreen", "()Z", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final List<Tuples2<UUID, UUID>> questionsAndAnswers;
        private final boolean skipConfirmationScreen;
        private final UUID submissionId;

        /* compiled from: RecommendationsRiskProfileLandingFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readSerializable());
                }
                return new Args(arrayList, (UUID) parcel.readSerializable(), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Args copy$default(Args args, List list, UUID uuid, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                list = args.questionsAndAnswers;
            }
            if ((i & 2) != 0) {
                uuid = args.submissionId;
            }
            if ((i & 4) != 0) {
                z = args.skipConfirmationScreen;
            }
            return args.copy(list, uuid, z);
        }

        public final List<Tuples2<UUID, UUID>> component1() {
            return this.questionsAndAnswers;
        }

        /* renamed from: component2, reason: from getter */
        public final UUID getSubmissionId() {
            return this.submissionId;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getSkipConfirmationScreen() {
            return this.skipConfirmationScreen;
        }

        public final Args copy(List<Tuples2<UUID, UUID>> questionsAndAnswers, UUID submissionId, boolean skipConfirmationScreen) {
            Intrinsics.checkNotNullParameter(questionsAndAnswers, "questionsAndAnswers");
            Intrinsics.checkNotNullParameter(submissionId, "submissionId");
            return new Args(questionsAndAnswers, submissionId, skipConfirmationScreen);
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
            return Intrinsics.areEqual(this.questionsAndAnswers, args.questionsAndAnswers) && Intrinsics.areEqual(this.submissionId, args.submissionId) && this.skipConfirmationScreen == args.skipConfirmationScreen;
        }

        public int hashCode() {
            return (((this.questionsAndAnswers.hashCode() * 31) + this.submissionId.hashCode()) * 31) + Boolean.hashCode(this.skipConfirmationScreen);
        }

        public String toString() {
            return "Args(questionsAndAnswers=" + this.questionsAndAnswers + ", submissionId=" + this.submissionId + ", skipConfirmationScreen=" + this.skipConfirmationScreen + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            List<Tuples2<UUID, UUID>> list = this.questionsAndAnswers;
            dest.writeInt(list.size());
            Iterator<Tuples2<UUID, UUID>> it = list.iterator();
            while (it.hasNext()) {
                dest.writeSerializable(it.next());
            }
            dest.writeSerializable(this.submissionId);
            dest.writeInt(this.skipConfirmationScreen ? 1 : 0);
        }

        public Args(List<Tuples2<UUID, UUID>> questionsAndAnswers, UUID submissionId, boolean z) {
            Intrinsics.checkNotNullParameter(questionsAndAnswers, "questionsAndAnswers");
            Intrinsics.checkNotNullParameter(submissionId, "submissionId");
            this.questionsAndAnswers = questionsAndAnswers;
            this.submissionId = submissionId;
            this.skipConfirmationScreen = z;
        }

        public final List<Tuples2<UUID, UUID>> getQuestionsAndAnswers() {
            return this.questionsAndAnswers;
        }

        public final UUID getSubmissionId() {
            return this.submissionId;
        }

        public final boolean getSkipConfirmationScreen() {
            return this.skipConfirmationScreen;
        }
    }

    /* compiled from: RecommendationsRiskProfileLandingFragment.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/recommendations/ui/risk/RecommendationsRiskProfileLandingFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/recommendations/ui/risk/RecommendationsRiskProfileLandingFragment;", "Lcom/robinhood/android/recommendations/ui/risk/RecommendationsRiskProfileLandingFragment$Args;", "<init>", "()V", "BACKGROUND_TRANSITION_NAME", "", "CONTINUE_BTN_TRANSITION_NAME", "LOTTIE_DROP_DOWN_START_FRAME", "", "LOTTIE_DROP_DOWN_END_FRAME", "LOTTIE_END_FRAME", "LOTTIE_SCALE_END_FRAME", "STARTING_SCALE", "", "feature-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<RecommendationsRiskProfileLandingFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(RecommendationsRiskProfileLandingFragment recommendationsRiskProfileLandingFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, recommendationsRiskProfileLandingFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public RecommendationsRiskProfileLandingFragment newInstance(Args args) {
            return (RecommendationsRiskProfileLandingFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(RecommendationsRiskProfileLandingFragment recommendationsRiskProfileLandingFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, recommendationsRiskProfileLandingFragment, args);
        }
    }
}
