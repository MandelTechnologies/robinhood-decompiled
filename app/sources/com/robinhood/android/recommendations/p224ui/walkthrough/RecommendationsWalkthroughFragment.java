package com.robinhood.android.recommendations.p224ui.walkthrough;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.transition.ChangeBounds;
import androidx.transition.ChangeImageTransform;
import androidx.transition.ChangeTransform;
import androidx.transition.Fade;
import androidx.transition.TransitionManager;
import androidx.transition.TransitionSet;
import com.airbnb.lottie.LottieAnimationView;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.extensions.BaseFragments2;
import com.robinhood.android.common.util.extensions.CharSequences;
import com.robinhood.android.common.util.extensions.Contexts7;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.progress.RdsProgressBar;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.recommendations.C25978R;
import com.robinhood.android.recommendations.databinding.FragmentRecommendationsWalkthroughBinding;
import com.robinhood.android.recommendations.p224ui.utils.Constants;
import com.robinhood.android.recommendations.p224ui.walkthrough.PortfolioBlocksDrawable;
import com.robinhood.android.recommendations.p224ui.walkthrough.RecommendationsWalkthroughFragment;
import com.robinhood.android.recommendations.p224ui.walkthrough.RecommendationsWalkthroughPage;
import com.robinhood.android.recommendations.p224ui.walkthrough.learnmore.RecommendationsLearnMoreDialogFragment;
import com.robinhood.android.util.extensions.LottieAnimationViewsKt;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.recommendations.models.api.RecommendationsLearnMoreEntryPoint;
import com.robinhood.recommendations.models.p363ui.UiRecommendationsPortfolio;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.remote.assets.LottieUrl;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.extensions.TextViewsKt;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.lifecycle.ContextLifecycles;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.PrimitiveIterators6;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.ranges.PrimitiveRanges2;
import kotlin.reflect.KProperty;

/* compiled from: RecommendationsWalkthroughFragment.kt */
@Metadata(m3635d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000b\b\u0007\u0018\u0000 Q2\u00020\u0001:\u0003OPQB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\u0010\u0010-\u001a\u00020*2\u0006\u0010.\u001a\u00020/H\u0016J\u001a\u00100\u001a\u00020*2\u0006\u00101\u001a\u0002022\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\b\u00103\u001a\u00020*H\u0016J\b\u00104\u001a\u00020*H\u0016J\b\u00105\u001a\u000206H\u0016J\u0010\u00107\u001a\u00020*2\u0006\u00108\u001a\u000209H\u0002J\u0010\u0010:\u001a\u00020*2\u0006\u0010;\u001a\u00020<H\u0002J\u0010\u0010=\u001a\u00020*2\u0006\u0010>\u001a\u000209H\u0002J\u0010\u0010?\u001a\u00020*2\u0006\u0010>\u001a\u000209H\u0002J\u0012\u0010@\u001a\u00020*2\b\u0010A\u001a\u0004\u0018\u00010BH\u0002J\u0010\u0010C\u001a\u00020*2\u0006\u0010;\u001a\u00020<H\u0002J \u0010D\u001a\u00020*2\u0006\u0010E\u001a\u0002062\u0006\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020GH\u0002J\u0018\u0010I\u001a\u00020*2\u0006\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020GH\u0002J\u0016\u0010J\u001a\u00020*2\f\u0010K\u001a\b\u0012\u0004\u0012\u00020\u001c0&H\u0002J\u0010\u0010L\u001a\u00020*2\u0006\u0010>\u001a\u000209H\u0002J\u0010\u0010M\u001a\u00020*2\u0006\u0010>\u001a\u000209H\u0002J\u0010\u0010N\u001a\u00020*2\u0006\u0010>\u001a\u000209H\u0002R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u001eR\u0016\u0010!\u001a\u0004\u0018\u00010\"8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001c0&8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006R"}, m3636d2 = {"Lcom/robinhood/android/recommendations/ui/walkthrough/RecommendationsWalkthroughFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "<init>", "()V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "duxo", "Lcom/robinhood/android/recommendations/ui/walkthrough/RecommendationsWalkthroughDuxo;", "getDuxo", "()Lcom/robinhood/android/recommendations/ui/walkthrough/RecommendationsWalkthroughDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "binding", "Lcom/robinhood/android/recommendations/databinding/FragmentRecommendationsWalkthroughBinding;", "getBinding", "()Lcom/robinhood/android/recommendations/databinding/FragmentRecommendationsWalkthroughBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "callbacks", "Lcom/robinhood/android/recommendations/ui/walkthrough/RecommendationsWalkthroughFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/recommendations/ui/walkthrough/RecommendationsWalkthroughFragment$Callbacks;", "callbacks$delegate", "portfolioViewWidth", "", "getPortfolioViewWidth", "()F", "lottieViewWidth", "getLottieViewWidth", "progressBar", "Lcom/robinhood/android/designsystem/progress/RdsProgressBar;", "getProgressBar", "()Lcom/robinhood/android/designsystem/progress/RdsProgressBar;", "defaultStartingWeights", "", "getDefaultStartingWeights", "()Ljava/util/List;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onViewCreated", "view", "Landroid/view/View;", "onStart", "onResume", "onBackPressed", "", "setCurrentPage", "currentPage", "Lcom/robinhood/android/recommendations/ui/walkthrough/RecommendationsWalkthroughPage;", "setViewState", "state", "Lcom/robinhood/android/recommendations/ui/walkthrough/RecommendationsWalkthroughViewState;", "updateContinueBtn", "page", "setLearnMore", "setProspectusText", "prospectus", "Lcom/robinhood/recommendations/models/ui/UiRecommendationsPortfolio$Link;", "setAnimationState", "animateLottie", "reverseAnimation", "startFrame", "", "endFrame", "animatePortfolioViewIncoming", "animatePortfolioViewWeighted", "weights", "logScreenAppear", "logContinueTap", "logLearnMoreTap", "Callbacks", "Args", "Companion", "feature-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class RecommendationsWalkthroughFragment extends BaseFragment {
    private static final long ANIMATION_DURATION_MS = 833;
    private static final TransitionSet ENTER_TRANSITION;
    private static final long LOTTIE_VISIBILITY_START_DELAY = 200;
    private static final int MAX_ALPHA = 255;
    private static final float PORTFOLIO_VIEW_SPACING = 32.0f;
    private static final float PROGRESS_BAR_ALPHA_PERCENTAGE = 0.1f;
    private static final TransitionSet SHARED_ELEMENT_ENTER_TRANSITION;
    private static final long SHARED_ELEMENT_TRANSITION_START_DELAY = 300;
    private static final long TRANSITION_DURATION = 1000;
    private static final String TRANSITION_NAME_BACKGROUND = "transition_background";
    private static final String TRANSITION_NAME_PORTFOLIO_VIEW = "transition_portfolio_view";

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    public EventLogger eventLogger;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RecommendationsWalkthroughFragment.class, "binding", "getBinding()Lcom/robinhood/android/recommendations/databinding/FragmentRecommendationsWalkthroughBinding;", 0)), Reflection.property1(new PropertyReference1Impl(RecommendationsWalkthroughFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/recommendations/ui/walkthrough/RecommendationsWalkthroughFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: RecommendationsWalkthroughFragment.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0018\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b0\u0007H&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/recommendations/ui/walkthrough/RecommendationsWalkthroughFragment$Callbacks;", "", "showPortfolioSummary", "", "portfolioRecommendation", "Lcom/robinhood/recommendations/models/ui/UiRecommendationsPortfolio;", "sharedElements", "", "Lkotlin/Pair;", "Landroid/view/View;", "", "onBackFromWalkthrough", "feature-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onBackFromWalkthrough(UiRecommendationsPortfolio portfolioRecommendation);

        void showPortfolioSummary(UiRecommendationsPortfolio portfolioRecommendation, List<? extends Tuples2<? extends View, String>> sharedElements);
    }

    /* compiled from: RecommendationsWalkthroughFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[DayNightOverlay.values().length];
            try {
                iArr[DayNightOverlay.DAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DayNightOverlay.NIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[RecommendationsWalkthroughPage.AnimationType.values().length];
            try {
                iArr2[RecommendationsWalkthroughPage.AnimationType.LOTTIE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[RecommendationsWalkthroughPage.AnimationType.PORTFOLIO_VIEW_INCOMING.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[RecommendationsWalkthroughPage.AnimationType.PORTFOLIO_VIEW_WEIGHTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public RecommendationsWalkthroughFragment() {
        super(C25978R.layout.fragment_recommendations_walkthrough);
        this.duxo = OldDuxos.oldDuxo(this, RecommendationsWalkthroughDuxo.class);
        this.binding = ViewBinding5.viewBinding(this, RecommendationsWalkthroughFragment5.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.recommendations.ui.walkthrough.RecommendationsWalkthroughFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof RecommendationsWalkthroughFragment.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
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
    public final RecommendationsWalkthroughDuxo getDuxo() {
        return (RecommendationsWalkthroughDuxo) this.duxo.getValue();
    }

    static {
        TransitionSet duration = new TransitionSet().addTransition(new Fade(1)).setDuration(1000L);
        Intrinsics.checkNotNullExpressionValue(duration, "setDuration(...)");
        ENTER_TRANSITION = duration;
        TransitionSet startDelay = new TransitionSet().addTransition(new ChangeBounds()).addTransition(new ChangeImageTransform()).addTransition(new ChangeTransform()).addTarget(C25978R.id.shared_element_lottie).setDuration(1000L).setStartDelay(300L);
        Intrinsics.checkNotNullExpressionValue(startDelay, "setStartDelay(...)");
        SHARED_ELEMENT_ENTER_TRANSITION = startDelay;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentRecommendationsWalkthroughBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentRecommendationsWalkthroughBinding) value;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getPortfolioViewWidth() {
        float width = getBinding().portfolioView.getWidth();
        RecommendationsPortfolioView portfolioView = getBinding().portfolioView;
        Intrinsics.checkNotNullExpressionValue(portfolioView, "portfolioView");
        float marginStart = width + ViewsKt.getMarginStart(portfolioView);
        RecommendationsPortfolioView portfolioView2 = getBinding().portfolioView;
        Intrinsics.checkNotNullExpressionValue(portfolioView2, "portfolioView");
        return marginStart + ViewsKt.getMarginEnd(portfolioView2);
    }

    private final float getLottieViewWidth() {
        return getBinding().lottieView.getWidth();
    }

    private final RdsProgressBar getProgressBar() {
        return (RdsProgressBar) requireToolbar().findViewById(C25978R.id.walkhrough_progress_bar);
    }

    private final List<Float> getDefaultStartingWeights() {
        int size = ((Args) INSTANCE.getArgs((Fragment) this)).getPortfolioBlocks().size();
        PrimitiveRanges2 primitiveRanges2 = new PrimitiveRanges2(1, size);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(primitiveRanges2, 10));
        Iterator<Integer> it = primitiveRanges2.iterator();
        while (it.hasNext()) {
            ((PrimitiveIterators6) it).nextInt();
            arrayList.add(Float.valueOf(1.0f / size));
        }
        return arrayList;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setEnterTransition(ENTER_TRANSITION);
        setSharedElementEnterTransition(SHARED_ELEMENT_ENTER_TRANSITION);
        postponeEnterTransition();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Drawable background;
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        if (getProgressBar() == null) {
            RhToolbar.addCustomView$default(toolbar, C25978R.layout.include_walkhrough_page_toolbar_content, true, 0, 4, null);
        }
        RdsProgressBar progressBar = getProgressBar();
        if (progressBar == null || (background = progressBar.getBackground()) == null) {
            return;
        }
        background.setAlpha(25);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        FragmentRecommendationsWalkthroughBinding binding = getBinding();
        ConstraintLayout root = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        BaseFragments2.setContentBelowToolbar(this, root);
        binding.portfolioView.setTransitionName(TRANSITION_NAME_PORTFOLIO_VIEW);
        binding.background.setTransitionName(TRANSITION_NAME_BACKGROUND);
        final RecommendationsPortfolioView recommendationsPortfolioView = binding.portfolioView;
        recommendationsPortfolioView.setWeights(getDefaultStartingWeights());
        recommendationsPortfolioView.setSpacing(PORTFOLIO_VIEW_SPACING);
        List<PortfolioBlocksDrawable.Block> portfolioBlocks = ((Args) INSTANCE.getArgs((Fragment) this)).getPortfolioBlocks();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(portfolioBlocks, 10));
        Iterator<T> it = portfolioBlocks.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((PortfolioBlocksDrawable.Block) it.next()).getColor()));
        }
        recommendationsPortfolioView.setBlockColors(arrayList);
        Intrinsics.checkNotNull(recommendationsPortfolioView);
        final ViewTreeObserver viewTreeObserver = recommendationsPortfolioView.getViewTreeObserver();
        viewTreeObserver.addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.robinhood.android.recommendations.ui.walkthrough.RecommendationsWalkthroughFragment$onViewCreated$lambda$7$lambda$2$$inlined$safeOnPreDraw$1
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                Context context = recommendationsPortfolioView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                if (Intrinsics.areEqual(ContextLifecycles.isResumed(context), Boolean.TRUE)) {
                    recommendationsPortfolioView.setTranslationX(this.getPortfolioViewWidth());
                }
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnPreDrawListener(this);
                    return true;
                }
                recommendationsPortfolioView.getViewTreeObserver().removeOnPreDrawListener(this);
                return true;
            }
        });
        final LottieAnimationView lottieAnimationView = binding.sharedElementLottie;
        lottieAnimationView.setTransitionName(Constants.RECS_MAIN_SHARED_LOTTIE_TRANSITION_NAME);
        Intrinsics.checkNotNull(lottieAnimationView);
        LottieAnimationViewsKt.setRemoteUrl(lottieAnimationView, ((Args) INSTANCE.getArgs((Fragment) this)).getSharedElementLottieUrl());
        final ViewTreeObserver viewTreeObserver2 = lottieAnimationView.getViewTreeObserver();
        viewTreeObserver2.addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.robinhood.android.recommendations.ui.walkthrough.RecommendationsWalkthroughFragment$onViewCreated$lambda$7$lambda$4$$inlined$safeOnPreDraw$1
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                Context context = lottieAnimationView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                if (Intrinsics.areEqual(ContextLifecycles.isResumed(context), Boolean.TRUE)) {
                    this.startPostponedEnterTransition();
                }
                if (viewTreeObserver2.isAlive()) {
                    viewTreeObserver2.removeOnPreDrawListener(this);
                    return true;
                }
                lottieAnimationView.getViewTreeObserver().removeOnPreDrawListener(this);
                return true;
            }
        });
        lottieAnimationView.addAnimatorListener(new AnimatorListenerAdapter() { // from class: com.robinhood.android.recommendations.ui.walkthrough.RecommendationsWalkthroughFragment$onViewCreated$1$2$2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                LottieAnimationView lottieAnimationView2 = lottieAnimationView;
                Intrinsics.checkNotNull(lottieAnimationView2);
                final RecommendationsWalkthroughFragment recommendationsWalkthroughFragment = this;
                lottieAnimationView2.postDelayed(new Runnable() { // from class: com.robinhood.android.recommendations.ui.walkthrough.RecommendationsWalkthroughFragment$onViewCreated$1$2$2$onAnimationEnd$$inlined$postDelayed$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        LottieAnimationView lottieView = recommendationsWalkthroughFragment.getBinding().lottieView;
                        Intrinsics.checkNotNullExpressionValue(lottieView, "lottieView");
                        lottieView.setVisibility(0);
                        recommendationsWalkthroughFragment.getBinding().continueBtn.setLoading(false);
                        recommendationsWalkthroughFragment.getDuxo().startFlow();
                    }
                }, 200L);
            }
        });
        getBinding().continueBtn.setLoading(true);
        lottieAnimationView.playAnimation();
        final LottieAnimationView lottieAnimationView2 = binding.lottieView;
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(requireBaseActivity().getDayNightStyleChanges()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.recommendations.ui.walkthrough.RecommendationsWalkthroughFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecommendationsWalkthroughFragment.onViewCreated$lambda$7$lambda$6$lambda$5(lottieAnimationView2, (DayNightOverlay) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$7$lambda$6$lambda$5(LottieAnimationView lottieAnimationView, DayNightOverlay dayNightOverlay) {
        LottieUrl lottieUrl;
        Intrinsics.checkNotNullParameter(dayNightOverlay, "dayNightOverlay");
        int i = WhenMappings.$EnumSwitchMapping$0[dayNightOverlay.ordinal()];
        if (i == 1) {
            lottieUrl = LottieUrl.RECS_PORTFOLIO_ASSETS_DAY;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            lottieUrl = LottieUrl.RECS_PORTFOLIO_ASSETS_NIGHT;
        }
        Intrinsics.checkNotNull(lottieAnimationView);
        LottieAnimationViewsKt.setRemoteUrl(lottieAnimationView, lottieUrl);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C261861(this));
        Observable<R> map = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.recommendations.ui.walkthrough.RecommendationsWalkthroughFragment$onStart$$inlined$mapNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(((RecommendationsWalkthroughViewState) it).getCurrentPage());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((RecommendationsWalkthroughFragment$onStart$$inlined$mapNotNull$1<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable observableDistinctUntilChanged = ObservablesKt.filterIsPresent(map).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C261873(this));
    }

    /* compiled from: RecommendationsWalkthroughFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.recommendations.ui.walkthrough.RecommendationsWalkthroughFragment$onStart$1 */
    /* synthetic */ class C261861 extends FunctionReferenceImpl implements Function1<RecommendationsWalkthroughViewState, Unit> {
        C261861(Object obj) {
            super(1, obj, RecommendationsWalkthroughFragment.class, "setViewState", "setViewState(Lcom/robinhood/android/recommendations/ui/walkthrough/RecommendationsWalkthroughViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RecommendationsWalkthroughViewState recommendationsWalkthroughViewState) {
            invoke2(recommendationsWalkthroughViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(RecommendationsWalkthroughViewState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((RecommendationsWalkthroughFragment) this.receiver).setViewState(p0);
        }
    }

    /* compiled from: RecommendationsWalkthroughFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.recommendations.ui.walkthrough.RecommendationsWalkthroughFragment$onStart$3 */
    /* synthetic */ class C261873 extends FunctionReferenceImpl implements Function1<RecommendationsWalkthroughPage, Unit> {
        C261873(Object obj) {
            super(1, obj, RecommendationsWalkthroughFragment.class, "setCurrentPage", "setCurrentPage(Lcom/robinhood/android/recommendations/ui/walkthrough/RecommendationsWalkthroughPage;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RecommendationsWalkthroughPage recommendationsWalkthroughPage) {
            invoke2(recommendationsWalkthroughPage);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(RecommendationsWalkthroughPage p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((RecommendationsWalkthroughFragment) this.receiver).setCurrentPage(p0);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.recommendations.ui.walkthrough.RecommendationsWalkthroughFragment$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecommendationsWalkthroughFragment.onResume$lambda$9(this.f$0, (RecommendationsWalkthroughViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$9(RecommendationsWalkthroughFragment recommendationsWalkthroughFragment, RecommendationsWalkthroughViewState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        UiEvent<Unit> animateProgress = state.getAnimateProgress();
        boolean z = (animateProgress != null ? animateProgress.consume() : null) != null;
        RdsProgressBar progressBar = recommendationsWalkthroughFragment.getProgressBar();
        if (progressBar != null) {
            progressBar.setVisibility(state.isProgressBarVisible() ? 0 : 8);
        }
        RdsProgressBar progressBar2 = recommendationsWalkthroughFragment.getProgressBar();
        if (progressBar2 != null) {
            progressBar2.setProgress(state.getProgress(), z);
        }
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        if (getBinding().continueBtn.getIsLoading()) {
            return true;
        }
        getDuxo().prevPage();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCurrentPage(RecommendationsWalkthroughPage currentPage) {
        logScreenAppear(currentPage);
        getBinding().title.setText(currentPage.getTitle());
        getBinding().description.setText(currentPage.getDescription());
        RhTextView disclosure = getBinding().disclosure;
        Intrinsics.checkNotNullExpressionValue(disclosure, "disclosure");
        TextViewsKt.setVisibilityText(disclosure, currentPage.getDisclosure());
        setLearnMore(currentPage);
        setProspectusText(currentPage.getProspectusLink());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setViewState(RecommendationsWalkthroughViewState state) {
        Toolbar toolbar = requireToolbar().getToolbar();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        toolbar.setNavigationIcon(state.getNavigationIconDrawable(contextRequireContext));
        RecommendationsWalkthroughPage currentPage = state.getCurrentPage();
        if (currentPage != null) {
            updateContinueBtn(currentPage);
        }
        if (state.getHideToolbar()) {
            requireBaseActivity().hideToolbar();
        }
        UiEvent<Unit> animateEvent = state.getAnimateEvent();
        if ((animateEvent != null ? animateEvent.consume() : null) != null) {
            setAnimationState(state);
        }
        UiEvent<Unit> backEvent = state.getBackEvent();
        if ((backEvent != null ? backEvent.consume() : null) != null) {
            getCallbacks().onBackFromWalkthrough(((Args) INSTANCE.getArgs((Fragment) this)).getPortfolioRecommendation());
        }
        UiEvent<Unit> showSummaryEvent = state.getShowSummaryEvent();
        if ((showSummaryEvent != null ? showSummaryEvent.consume() : null) != null) {
            getCallbacks().showPortfolioSummary(((Args) INSTANCE.getArgs((Fragment) this)).getPortfolioRecommendation(), CollectionsKt.listOf((Object[]) new Tuples2[]{Tuples4.m3642to(getBinding().portfolioView, getBinding().portfolioView.getTransitionName()), Tuples4.m3642to(getBinding().background, getBinding().background.getTransitionName())}));
        }
    }

    private final void updateContinueBtn(final RecommendationsWalkthroughPage page) {
        RdsButton rdsButton = getBinding().continueBtn;
        Intrinsics.checkNotNull(rdsButton);
        OnClickListeners.onClick(rdsButton, new Function0() { // from class: com.robinhood.android.recommendations.ui.walkthrough.RecommendationsWalkthroughFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RecommendationsWalkthroughFragment.updateContinueBtn$lambda$14$lambda$11(this.f$0, page);
            }
        });
        CharSequence text = rdsButton.getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        if (text.length() > 0 || rdsButton.getIcon() != null) {
            LottieAnimationView sharedElementLottie = getBinding().sharedElementLottie;
            Intrinsics.checkNotNullExpressionValue(sharedElementLottie, "sharedElementLottie");
            sharedElementLottie.setVisibility(8);
            TransitionManager.beginDelayedTransition(getBinding().getRoot());
        }
        String continueBtnTitle = page.getContinueBtnTitle();
        if (continueBtnTitle != null) {
            rdsButton.setText(continueBtnTitle);
            rdsButton.setIcon(null);
            ViewGroup.LayoutParams layoutParams = rdsButton.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.width = 0;
            rdsButton.setLayoutParams(layoutParams);
            return;
        }
        rdsButton.setText((CharSequence) null);
        Context context = rdsButton.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        rdsButton.setIcon(Contexts7.getThemeDrawable(context, C20690R.attr.iconArrowRight16dp));
        ViewGroup.LayoutParams layoutParams2 = rdsButton.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams2.width = -2;
        rdsButton.setLayoutParams(layoutParams2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateContinueBtn$lambda$14$lambda$11(RecommendationsWalkthroughFragment recommendationsWalkthroughFragment, RecommendationsWalkthroughPage recommendationsWalkthroughPage) {
        recommendationsWalkthroughFragment.logContinueTap(recommendationsWalkthroughPage);
        recommendationsWalkthroughFragment.getDuxo().nextPage();
        return Unit.INSTANCE;
    }

    private final void setLearnMore(final RecommendationsWalkthroughPage page) {
        RhTextView rhTextView = getBinding().learnMore;
        if (page instanceof RecommendationsWalkthroughPage.Simple) {
            Intrinsics.checkNotNull(rhTextView);
            rhTextView.setVisibility(8);
            rhTextView.setOnClickListener(null);
        } else {
            if (!(page instanceof RecommendationsWalkthroughPage.Asset)) {
                throw new NoWhenBranchMatchedException();
            }
            Intrinsics.checkNotNull(rhTextView);
            rhTextView.setVisibility(0);
            rhTextView.setText(CharSequences.addUnderlineToText(((RecommendationsWalkthroughPage.Asset) page).getLearnMoreTitle()));
            OnClickListeners.onClick(rhTextView, new Function0() { // from class: com.robinhood.android.recommendations.ui.walkthrough.RecommendationsWalkthroughFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RecommendationsWalkthroughFragment.setLearnMore$lambda$16$lambda$15(this.f$0, page);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setLearnMore$lambda$16$lambda$15(RecommendationsWalkthroughFragment recommendationsWalkthroughFragment, RecommendationsWalkthroughPage recommendationsWalkthroughPage) {
        recommendationsWalkthroughFragment.logLearnMoreTap(recommendationsWalkthroughPage);
        RecommendationsWalkthroughPage.Asset asset = (RecommendationsWalkthroughPage.Asset) recommendationsWalkthroughPage;
        RecommendationsLearnMoreDialogFragment recommendationsLearnMoreDialogFragment = (RecommendationsLearnMoreDialogFragment) RecommendationsLearnMoreDialogFragment.INSTANCE.newInstance((Parcelable) new RecommendationsLearnMoreDialogFragment.Args(asset.getInstrumentId(), null, asset.getLoggingScreen(), RecommendationsLearnMoreEntryPoint.FIRST_TRADE_RECOMMENDATIONS, null, null, null, 112, null));
        FragmentManager childFragmentManager = recommendationsWalkthroughFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        recommendationsLearnMoreDialogFragment.show(childFragmentManager, "recs-walkthrough-learn-more");
        return Unit.INSTANCE;
    }

    private final void setProspectusText(final UiRecommendationsPortfolio.Link prospectus) {
        RhTextView rhTextView = getBinding().prospectusText;
        Intrinsics.checkNotNull(rhTextView);
        rhTextView.setVisibility(prospectus != null ? 0 : 8);
        if (prospectus == null) {
            return;
        }
        rhTextView.setText(prospectus.getText());
        ServerToBentoAssetMapper2.Companion companion = ServerToBentoAssetMapper2.INSTANCE;
        ServerToBentoAssetMapper2 icon = prospectus.getIcon();
        ServerToBentoAssetMapper2 serverToBentoAssetMapper2FromServerValue = companion.fromServerValue(icon != null ? icon.getServerValue() : null);
        Integer numValueOf = serverToBentoAssetMapper2FromServerValue != null ? Integer.valueOf(serverToBentoAssetMapper2FromServerValue.getResourceId()) : null;
        TextViewsKt.setDrawableEnd(rhTextView, numValueOf != null ? AppCompatResources.getDrawable(requireContext(), numValueOf.intValue()) : null);
        OnClickListeners.onClick(rhTextView, new Function0() { // from class: com.robinhood.android.recommendations.ui.walkthrough.RecommendationsWalkthroughFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RecommendationsWalkthroughFragment.setProspectusText$lambda$20$lambda$19(prospectus, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setProspectusText$lambda$20$lambda$19(UiRecommendationsPortfolio.Link link, RecommendationsWalkthroughFragment recommendationsWalkthroughFragment) {
        String url = link.getUrl();
        if (url != null) {
            Navigator navigator = recommendationsWalkthroughFragment.getNavigator();
            Context contextRequireContext = recommendationsWalkthroughFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, Uri.parse(url), null, null, false, null, 60, null);
        }
        return Unit.INSTANCE;
    }

    private final void setAnimationState(RecommendationsWalkthroughViewState state) {
        RecommendationsWalkthroughPage currentPage = state.getCurrentPage();
        RecommendationsWalkthroughPage.AnimationType animationType = currentPage != null ? currentPage.getAnimationType() : null;
        int i = animationType == null ? -1 : WhenMappings.$EnumSwitchMapping$1[animationType.ordinal()];
        if (i != -1) {
            if (i == 1) {
                animateLottie(state.getReverseAnimation(), state.getStartFrame(), state.getEndFrame());
            } else if (i == 2) {
                animatePortfolioViewIncoming(state.getStartFrame(), state.getEndFrame());
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                animatePortfolioViewWeighted(state.getPortfolioWeights());
            }
        }
    }

    private final void animateLottie(boolean reverseAnimation, final int startFrame, final int endFrame) {
        getBinding().portfolioView.animate().translationX(getPortfolioViewWidth()).setDuration(ANIMATION_DURATION_MS).start();
        getBinding().lottieView.animate().translationX(0.0f).setDuration(ANIMATION_DURATION_MS).start();
        getBinding().continueBtn.setLoading(true);
        final LottieAnimationView lottieAnimationView = getBinding().lottieView;
        if (reverseAnimation) {
            lottieAnimationView.setSpeed(-1.0f);
            lottieAnimationView.addAnimatorListener(new AnimatorListenerAdapter() { // from class: com.robinhood.android.recommendations.ui.walkthrough.RecommendationsWalkthroughFragment$animateLottie$1$1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animation) {
                    Intrinsics.checkNotNullParameter(animation, "animation");
                    lottieAnimationView.setMinAndMaxFrame(startFrame, endFrame);
                    lottieAnimationView.removeAnimatorListener(this);
                }
            });
        } else {
            lottieAnimationView.setSpeed(1.0f);
            lottieAnimationView.setMinAndMaxFrame(startFrame, endFrame);
        }
        lottieAnimationView.addAnimatorListener(new AnimatorListenerAdapter() { // from class: com.robinhood.android.recommendations.ui.walkthrough.RecommendationsWalkthroughFragment$animateLottie$1$2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                this.this$0.getBinding().continueBtn.setLoading(false);
            }
        });
        lottieAnimationView.playAnimation();
    }

    private final void animatePortfolioViewIncoming(int startFrame, int endFrame) {
        RecommendationsPortfolioView recommendationsPortfolioView = getBinding().portfolioView;
        recommendationsPortfolioView.animate().translationX(0.0f).setDuration(ANIMATION_DURATION_MS).start();
        recommendationsPortfolioView.playLoadingAnimation();
        LottieAnimationView lottieAnimationView = getBinding().lottieView;
        lottieAnimationView.setMinAndMaxFrame(startFrame, endFrame);
        lottieAnimationView.animate().translationX(-getLottieViewWidth()).setDuration(ANIMATION_DURATION_MS).start();
    }

    private final void animatePortfolioViewWeighted(List<Float> weights) {
        FragmentRecommendationsWalkthroughBinding binding = getBinding();
        binding.continueBtn.setEnabled(false);
        RecommendationsPortfolioView recommendationsPortfolioView = binding.portfolioView;
        recommendationsPortfolioView.stopAnimation();
        Iterator it = CollectionsKt.listOf((Object[]) new View[]{binding.title, binding.prospectusText, binding.description, binding.learnMore, binding.continueBtn}).iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(4);
        }
        RhTextView loadingText = binding.loadingText;
        Intrinsics.checkNotNullExpressionValue(loadingText, "loadingText");
        loadingText.setVisibility(0);
        recommendationsPortfolioView.playCalculationAnimation(weights, new RecommendationsWalkthroughFragment4(getDuxo()));
    }

    private final void logScreenAppear(RecommendationsWalkthroughPage page) {
        Screen loggingScreen = page.getLoggingScreen();
        if (loggingScreen == null) {
            return;
        }
        if (loggingScreen.getName() == Screen.Name.RECS_PORTFOLIO_WALKTHROUGH) {
            EventLogger.DefaultImpls.logAppear$default(getEventLogger(), null, loggingScreen, null, null, null, 29, null);
        } else {
            EventLogger.DefaultImpls.logScreenAppear$default(getEventLogger(), null, loggingScreen, null, null, null, 29, null);
        }
    }

    private final void logContinueTap(RecommendationsWalkthroughPage page) {
        Screen loggingScreen = page.getLoggingScreen();
        if (loggingScreen == null) {
            return;
        }
        EventLogger.DefaultImpls.logTap$default(getEventLogger(), UserInteractionEventData.Action.CONTINUE, loggingScreen, new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, null, false, 56, null);
    }

    private final void logLearnMoreTap(RecommendationsWalkthroughPage page) {
        Screen loggingScreen = page.getLoggingScreen();
        if (loggingScreen == null) {
            return;
        }
        EventLogger.DefaultImpls.logTap$default(getEventLogger(), UserInteractionEventData.Action.LEARN_MORE, loggingScreen, new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, null, false, 56, null);
    }

    /* compiled from: RecommendationsWalkthroughFragment.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\u0014\u001a\u00020\u0015J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/recommendations/ui/walkthrough/RecommendationsWalkthroughFragment$Args;", "Landroid/os/Parcelable;", "portfolioRecommendation", "Lcom/robinhood/recommendations/models/ui/UiRecommendationsPortfolio;", "portfolioBlocks", "", "Lcom/robinhood/android/recommendations/ui/walkthrough/PortfolioBlocksDrawable$Block;", "pages", "Lcom/robinhood/android/recommendations/ui/walkthrough/RecommendationsWalkthroughPage;", "sharedElementLottieUrl", "Lcom/robinhood/shared/remote/assets/LottieUrl;", "<init>", "(Lcom/robinhood/recommendations/models/ui/UiRecommendationsPortfolio;Ljava/util/List;Ljava/util/List;Lcom/robinhood/shared/remote/assets/LottieUrl;)V", "getPortfolioRecommendation", "()Lcom/robinhood/recommendations/models/ui/UiRecommendationsPortfolio;", "getPortfolioBlocks", "()Ljava/util/List;", "getPages", "getSharedElementLottieUrl", "()Lcom/robinhood/shared/remote/assets/LottieUrl;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Args implements Parcelable {
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final List<RecommendationsWalkthroughPage> pages;
        private final List<PortfolioBlocksDrawable.Block> portfolioBlocks;
        private final UiRecommendationsPortfolio portfolioRecommendation;
        private final LottieUrl sharedElementLottieUrl;

        /* compiled from: RecommendationsWalkthroughFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                UiRecommendationsPortfolio uiRecommendationsPortfolio = (UiRecommendationsPortfolio) parcel.readParcelable(Args.class.getClassLoader());
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(PortfolioBlocksDrawable.Block.CREATOR.createFromParcel(parcel));
                }
                int i3 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(parcel.readParcelable(Args.class.getClassLoader()));
                }
                return new Args(uiRecommendationsPortfolio, arrayList, arrayList2, LottieUrl.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.portfolioRecommendation, flags);
            List<PortfolioBlocksDrawable.Block> list = this.portfolioBlocks;
            dest.writeInt(list.size());
            Iterator<PortfolioBlocksDrawable.Block> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
            List<RecommendationsWalkthroughPage> list2 = this.pages;
            dest.writeInt(list2.size());
            Iterator<RecommendationsWalkthroughPage> it2 = list2.iterator();
            while (it2.hasNext()) {
                dest.writeParcelable(it2.next(), flags);
            }
            dest.writeString(this.sharedElementLottieUrl.name());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Args(UiRecommendationsPortfolio portfolioRecommendation, List<PortfolioBlocksDrawable.Block> portfolioBlocks, List<? extends RecommendationsWalkthroughPage> pages, LottieUrl sharedElementLottieUrl) {
            Intrinsics.checkNotNullParameter(portfolioRecommendation, "portfolioRecommendation");
            Intrinsics.checkNotNullParameter(portfolioBlocks, "portfolioBlocks");
            Intrinsics.checkNotNullParameter(pages, "pages");
            Intrinsics.checkNotNullParameter(sharedElementLottieUrl, "sharedElementLottieUrl");
            this.portfolioRecommendation = portfolioRecommendation;
            this.portfolioBlocks = portfolioBlocks;
            this.pages = pages;
            this.sharedElementLottieUrl = sharedElementLottieUrl;
        }

        public final UiRecommendationsPortfolio getPortfolioRecommendation() {
            return this.portfolioRecommendation;
        }

        public final List<PortfolioBlocksDrawable.Block> getPortfolioBlocks() {
            return this.portfolioBlocks;
        }

        public final List<RecommendationsWalkthroughPage> getPages() {
            return this.pages;
        }

        public final LottieUrl getSharedElementLottieUrl() {
            return this.sharedElementLottieUrl;
        }
    }

    /* compiled from: RecommendationsWalkthroughFragment.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/recommendations/ui/walkthrough/RecommendationsWalkthroughFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/recommendations/ui/walkthrough/RecommendationsWalkthroughFragment;", "Lcom/robinhood/android/recommendations/ui/walkthrough/RecommendationsWalkthroughFragment$Args;", "<init>", "()V", "ANIMATION_DURATION_MS", "", "PORTFOLIO_VIEW_SPACING", "", "MAX_ALPHA", "", "PROGRESS_BAR_ALPHA_PERCENTAGE", "TRANSITION_NAME_PORTFOLIO_VIEW", "", "TRANSITION_NAME_BACKGROUND", "TRANSITION_DURATION", "SHARED_ELEMENT_TRANSITION_START_DELAY", "LOTTIE_VISIBILITY_START_DELAY", "ENTER_TRANSITION", "Landroidx/transition/TransitionSet;", "SHARED_ELEMENT_ENTER_TRANSITION", "feature-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<RecommendationsWalkthroughFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(RecommendationsWalkthroughFragment recommendationsWalkthroughFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, recommendationsWalkthroughFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public RecommendationsWalkthroughFragment newInstance(Args args) {
            return (RecommendationsWalkthroughFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(RecommendationsWalkthroughFragment recommendationsWalkthroughFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, recommendationsWalkthroughFragment, args);
        }
    }
}
