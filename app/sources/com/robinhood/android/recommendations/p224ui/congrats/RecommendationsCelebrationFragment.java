package com.robinhood.android.recommendations.p224ui.congrats;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Bundle;
import android.view.View;
import android.view.WindowInsets;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieOnCompositionLoadedListener;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.daynight.DayNightChanges;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.recommendations.C25978R;
import com.robinhood.android.recommendations.databinding.FragmentRecommendationsCelebrationBinding;
import com.robinhood.android.recommendations.p224ui.congrats.RecommendationsCelebrationFragment;
import com.robinhood.android.util.extensions.LottieAnimationViewsKt;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.scarlet.util.resource.ThemedResourceReference;
import com.robinhood.shared.remote.assets.LottieUrl;
import com.robinhood.test.idler.IdlingResourceCounters2;
import com.robinhood.test.idler.IdlingResourceType;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import io.reactivex.Observable;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: RecommendationsCelebrationFragment.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 &2\u00020\u00012\u00020\u0002:\u0002%&B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\nH\u0016J\u001a\u0010 \u001a\u00020\u00192\u0006\u0010!\u001a\u00020\"2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010#\u001a\u00020\u0019H\u0002J\b\u0010$\u001a\u00020\u0019H\u0002R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\nX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0015\u0010\u0016¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/recommendations/ui/congrats/RecommendationsCelebrationFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "excludeFromAutoScreenDisappearEventLogging", "", "getExcludeFromAutoScreenDisappearEventLogging", "()Z", "binding", "Lcom/robinhood/android/recommendations/databinding/FragmentRecommendationsCelebrationBinding;", "getBinding", "()Lcom/robinhood/android/recommendations/databinding/FragmentRecommendationsCelebrationBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "callbacks", "Lcom/robinhood/android/recommendations/ui/congrats/RecommendationsCelebrationFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/recommendations/ui/congrats/RecommendationsCelebrationFragment$Callbacks;", "callbacks$delegate", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onBackPressed", "onViewCreated", "view", "Landroid/view/View;", "playAnimationDelayed", "fadeInViews", "Callbacks", "Companion", "feature-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class RecommendationsCelebrationFragment extends BaseFragment implements AutoLoggableFragment {
    private static final long ANIM_DURATION_MS = 1000;
    private static final long ANIM_START_DELAY_MS = 1250;
    private static final long LOTTIE_ANIM_START_DELAY_MS = 650;
    private static final float TEXT_SCALE_UP_SIZE = 1.3f;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    private final Screen eventScreen;
    private final boolean excludeFromAutoScreenDisappearEventLogging;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RecommendationsCelebrationFragment.class, "binding", "getBinding()Lcom/robinhood/android/recommendations/databinding/FragmentRecommendationsCelebrationBinding;", 0)), Reflection.property1(new PropertyReference1Impl(RecommendationsCelebrationFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/recommendations/ui/congrats/RecommendationsCelebrationFragment$Callbacks;", 0))};

    /* compiled from: RecommendationsCelebrationFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/recommendations/ui/congrats/RecommendationsCelebrationFragment$Callbacks;", "", "onExitCelebration", "", "feature-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onExitCelebration();
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

    public RecommendationsCelebrationFragment() {
        super(C25978R.layout.fragment_recommendations_celebration);
        this.eventScreen = new Screen(Screen.Name.RECS_TRADE_CELEBRATION, null, null, null, 14, null);
        this.excludeFromAutoScreenDisappearEventLogging = true;
        this.binding = ViewBinding5.viewBinding(this, RecommendationsCelebrationFragment2.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.recommendations.ui.congrats.RecommendationsCelebrationFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (android.content.Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof RecommendationsCelebrationFragment.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return this.eventScreen;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenDisappearEventLogging() {
        return this.excludeFromAutoScreenDisappearEventLogging;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentRecommendationsCelebrationBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentRecommendationsCelebrationBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        requireActivity().getWindow().getDecorView().setSystemUiVisibility(1280);
        super.onCreate(savedInstanceState);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setUseDesignSystemTheme(true);
        toolbar.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.robinhood.android.recommendations.ui.congrats.RecommendationsCelebrationFragment$configureToolbar$1$1
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View v, WindowInsets insets) {
                Intrinsics.checkNotNullParameter(v, "v");
                Intrinsics.checkNotNullParameter(insets, "insets");
                ViewsKt.setMarginTop(v, insets.getSystemWindowInsetTop());
                return insets.consumeSystemWindowInsets();
            }
        });
        ScarletManager2.overrideAttribute(toolbar, R.attr.backgroundTint, new ThemedResourceReference(ResourceType.COLOR.INSTANCE, C20690R.attr.colorTransparent));
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        getCallbacks().onExitCelebration();
        return true;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        FragmentRecommendationsCelebrationBinding binding = getBinding();
        binding.title.setAlpha(0.0f);
        binding.title.setScaleX(TEXT_SCALE_UP_SIZE);
        binding.title.setScaleY(TEXT_SCALE_UP_SIZE);
        binding.subtitle.setAlpha(0.0f);
        binding.subtitle.setScaleX(TEXT_SCALE_UP_SIZE);
        binding.subtitle.setScaleY(TEXT_SCALE_UP_SIZE);
        binding.doneBtn.setAlpha(0.0f);
        RdsButton doneBtn = binding.doneBtn;
        Intrinsics.checkNotNullExpressionValue(doneBtn, "doneBtn");
        ApplyWindowInsets.m26663applyWindowInsetsAsMarginqNU9l24(doneBtn, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        final LottieAnimationView lottieAnimationView = getBinding().lottie;
        lottieAnimationView.addAnimatorListener(new AnimatorListenerAdapter() { // from class: com.robinhood.android.recommendations.ui.congrats.RecommendationsCelebrationFragment$onViewCreated$2$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                this.this$0.fadeInViews();
            }
        });
        lottieAnimationView.addLottieOnCompositionLoadedListener(new LottieOnCompositionLoadedListener() { // from class: com.robinhood.android.recommendations.ui.congrats.RecommendationsCelebrationFragment$onViewCreated$2$2
            @Override // com.airbnb.lottie.LottieOnCompositionLoadedListener
            public final void onCompositionLoaded(LottieComposition lottieComposition) {
                this.this$0.playAnimationDelayed();
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(requireBaseActivity().getDayNightStyleChanges()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.recommendations.ui.congrats.RecommendationsCelebrationFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecommendationsCelebrationFragment.onViewCreated$lambda$3$lambda$2(lottieAnimationView, (DayNightOverlay) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$3$lambda$2(LottieAnimationView lottieAnimationView, DayNightOverlay it) {
        Intrinsics.checkNotNullParameter(it, "it");
        LottieUrl lottieUrl = DayNightChanges.isDay(it) ? LottieUrl.RECS_CELEBRATION_DAY : LottieUrl.RECS_CELEBRATION_NIGHT;
        Intrinsics.checkNotNull(lottieAnimationView);
        LottieAnimationViewsKt.setRemoteUrl(lottieAnimationView, lottieUrl);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void playAnimationDelayed() {
        Observable<Long> observableTimer = Observable.timer(LOTTIE_ANIM_START_DELAY_MS, TimeUnit.MILLISECONDS);
        Intrinsics.checkNotNullExpressionValue(observableTimer, "timer(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableTimer), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.recommendations.ui.congrats.RecommendationsCelebrationFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecommendationsCelebrationFragment.playAnimationDelayed$lambda$4(this.f$0, (Long) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit playAnimationDelayed$lambda$4(RecommendationsCelebrationFragment recommendationsCelebrationFragment, Long l) {
        recommendationsCelebrationFragment.getBinding().lottie.playAnimation();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fadeInViews() {
        Iterator it = CollectionsKt.listOf((Object[]) new View[]{getBinding().title, getBinding().subtitle}).iterator();
        while (it.hasNext()) {
            ((View) it.next()).animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(1000L).setStartDelay(ANIM_START_DELAY_MS).setListener(new AnimatorListenerAdapter() { // from class: com.robinhood.android.recommendations.ui.congrats.RecommendationsCelebrationFragment$fadeInViews$1$1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animation) {
                    Intrinsics.checkNotNullParameter(animation, "animation");
                    IdlingResourceCounters2.setBusy(IdlingResourceType.RECOMMENDATIONS_CHECKOUT_CELEBRATION, false);
                }
            }).start();
        }
        getBinding().doneBtn.animate().alpha(1.0f).setDuration(1000L).setStartDelay(ANIM_START_DELAY_MS).setListener(new AnimatorListenerAdapter() { // from class: com.robinhood.android.recommendations.ui.congrats.RecommendationsCelebrationFragment.fadeInViews.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                RdsButton doneBtn = RecommendationsCelebrationFragment.this.getBinding().doneBtn;
                Intrinsics.checkNotNullExpressionValue(doneBtn, "doneBtn");
                OnClickListeners.onClick(doneBtn, new RecommendationsCelebrationFragment5(RecommendationsCelebrationFragment.this.getCallbacks()));
            }
        }).start();
    }
}
