package com.robinhood.android.recommendations.p224ui.walkthrough;

import android.animation.TimeInterpolator;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.ChangeBounds;
import androidx.transition.ChangeTransform;
import androidx.transition.Fade;
import androidx.transition.Transition;
import androidx.transition.TransitionListenerAdapter;
import androidx.transition.TransitionSet;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.autoeventlogging.ViewsKt;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.daynight.DayNightChanges;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.util.extensions.BaseFragments2;
import com.robinhood.android.common.util.extensions.Contexts7;
import com.robinhood.android.common.util.extensions.RichTexts;
import com.robinhood.android.designsystem.banner.RdsInfoBannerView;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyDialogFragmentKey;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.android.recommendations.C25978R;
import com.robinhood.android.recommendations.contracts.RecommendationsIntentKeys2;
import com.robinhood.android.recommendations.databinding.FragmentRecommendationsWalkthroughSummaryBinding;
import com.robinhood.android.recommendations.p224ui.utils.UiRecommendationPortfolios;
import com.robinhood.android.recommendations.p224ui.walkthrough.PortfolioBlocksDrawable;
import com.robinhood.android.recommendations.p224ui.walkthrough.RecommendationsWalkthroughSummaryFragment;
import com.robinhood.android.recommendations.p224ui.walkthrough.learnmore.RecommendationsLearnMoreDialogFragment;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.serverdriven.p347db.BannerComponent;
import com.robinhood.models.serverdriven.p347db.GenericAction;
import com.robinhood.models.serverdriven.p347db.RichText;
import com.robinhood.recommendations.models.api.RecommendationsLearnMoreEntryPoint;
import com.robinhood.recommendations.models.p363ui.UiRecommendationsPortfolio;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.PerformanceMetricEventData;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.lifecycle.ContextLifecycles;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import org.bouncycastle.i18n.ErrorBundle;

/* compiled from: RecommendationsWalkthroughSummaryFragment.kt */
@Metadata(m3635d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 =2\u00020\u00012\u00020\u00022\u00020\u0003:\u0003;<=B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0016J\u0012\u0010'\u001a\u00020$2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\b\u0010*\u001a\u00020 H\u0016J\u001a\u0010+\u001a\u00020$2\u0006\u0010,\u001a\u00020-2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\"\u0010.\u001a\u00020$2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002002\b\u00102\u001a\u0004\u0018\u000103H\u0016J\b\u00104\u001a\u00020$H\u0002J\b\u00105\u001a\u00020$H\u0002J\u001a\u00106\u001a\u00020 2\u0006\u00107\u001a\u0002002\b\u00108\u001a\u0004\u0018\u00010)H\u0016J\f\u00109\u001a\u00020$*\u00020-H\u0002J\f\u0010:\u001a\u00020$*\u00020-H\u0002R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\u00020\u001cX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020 X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u0006>"}, m3636d2 = {"Lcom/robinhood/android/recommendations/ui/walkthrough/RecommendationsWalkthroughSummaryFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/common/ui/RhDialogFragment$OnClickListener;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "callbacks", "Lcom/robinhood/android/recommendations/ui/walkthrough/RecommendationsWalkthroughSummaryFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/recommendations/ui/walkthrough/RecommendationsWalkthroughSummaryFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "binding", "Lcom/robinhood/android/recommendations/databinding/FragmentRecommendationsWalkthroughSummaryBinding;", "getBinding", "()Lcom/robinhood/android/recommendations/databinding/FragmentRecommendationsWalkthroughSummaryBinding;", "binding$delegate", "adapter", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/android/recommendations/ui/walkthrough/PortfolioSummaryRowView;", "Lcom/robinhood/recommendations/models/ui/UiRecommendationsPortfolio$BreakdownRow;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "excludeFromAutoScreenDisappearEventLogging", "", "getExcludeFromAutoScreenDisappearEventLogging", "()Z", "configureToolbar", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onBackPressed", "onViewCreated", "view", "Landroid/view/View;", "onActivityResult", "requestCode", "", "resultCode", WebsocketGatewayConstants.DATA_KEY, "Landroid/content/Intent;", "startOrderFlow", "showExitAlert", "onPositiveButtonClicked", "id", "passthroughArgs", "startUpAnimation", "startDownAnimation", "Callbacks", "Args", "Companion", "feature-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class RecommendationsWalkthroughSummaryFragment extends BaseFragment implements RhDialogFragment.OnClickListener, AutoLoggableFragment {
    private static final TransitionSet ENTER_TRANSITION;
    private static final float ORB_Y_DELTA = 50.0f;
    private static final int RECS_SUMMARY_REQUEST_CODE = 777;
    private static final long TRANSITION_DURATION = 600;
    private static final long UP_DOWN_ANIMATION_DURATION = 2000;
    private static final float UP_DOWN_ANIMATION_VERTICAL_DELTA = 24.0f;
    private final GenericListAdapter<PortfolioSummaryRowView, UiRecommendationsPortfolio.BreakdownRow> adapter;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    public EventLogger eventLogger;
    private final Screen eventScreen;
    private final boolean excludeFromAutoScreenDisappearEventLogging;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RecommendationsWalkthroughSummaryFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/recommendations/ui/walkthrough/RecommendationsWalkthroughSummaryFragment$Callbacks;", 0)), Reflection.property1(new PropertyReference1Impl(RecommendationsWalkthroughSummaryFragment.class, "binding", "getBinding()Lcom/robinhood/android/recommendations/databinding/FragmentRecommendationsWalkthroughSummaryBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final DecelerateInterpolator UP_DOWN_ANIMATION_INTERPOLATOR = new DecelerateInterpolator();

    /* compiled from: RecommendationsWalkthroughSummaryFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/recommendations/ui/walkthrough/RecommendationsWalkthroughSummaryFragment$Callbacks;", "", "onShowCelebration", "", "feature-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onShowCelebration();
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

    public RecommendationsWalkthroughSummaryFragment() {
        super(C25978R.layout.fragment_recommendations_walkthrough_summary);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.recommendations.ui.walkthrough.RecommendationsWalkthroughSummaryFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (android.content.Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof RecommendationsWalkthroughSummaryFragment.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
        this.binding = ViewBinding5.viewBinding(this, RecommendationsWalkthroughSummaryFragment2.INSTANCE);
        this.adapter = GenericListAdapter.INSTANCE.m2987of(PortfolioSummaryRowView.INSTANCE, DiffCallbacks.Equality.INSTANCE, new Function2() { // from class: com.robinhood.android.recommendations.ui.walkthrough.RecommendationsWalkthroughSummaryFragment$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return RecommendationsWalkthroughSummaryFragment.adapter$lambda$2(this.f$0, (PortfolioSummaryRowView) obj, (UiRecommendationsPortfolio.BreakdownRow) obj2);
            }
        });
        this.eventScreen = new Screen(Screen.Name.RECS_PORTFOLIO_SUMMARY, null, null, null, 14, null);
        this.excludeFromAutoScreenDisappearEventLogging = true;
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

    static {
        TransitionSet startDelay = new TransitionSet().addTransition(new Fade(1)).setStartDelay(300L);
        Intrinsics.checkNotNullExpressionValue(startDelay, "setStartDelay(...)");
        ENTER_TRANSITION = startDelay;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentRecommendationsWalkthroughSummaryBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[1]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentRecommendationsWalkthroughSummaryBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit adapter$lambda$2(final RecommendationsWalkthroughSummaryFragment recommendationsWalkthroughSummaryFragment, PortfolioSummaryRowView of, final UiRecommendationsPortfolio.BreakdownRow item) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(item, "item");
        of.bind(item);
        ViewsKt.eventData$default(of, false, new Function0() { // from class: com.robinhood.android.recommendations.ui.walkthrough.RecommendationsWalkthroughSummaryFragment$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RecommendationsWalkthroughSummaryFragment.adapter$lambda$2$lambda$0(item);
            }
        }, 1, null);
        OnClickListeners.onClick(of, new Function0() { // from class: com.robinhood.android.recommendations.ui.walkthrough.RecommendationsWalkthroughSummaryFragment$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RecommendationsWalkthroughSummaryFragment.adapter$lambda$2$lambda$1(item, recommendationsWalkthroughSummaryFragment);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor adapter$lambda$2$lambda$0(UiRecommendationsPortfolio.BreakdownRow breakdownRow) {
        Component.ComponentType componentType = Component.ComponentType.ROW;
        String string2 = breakdownRow.getInstrumentId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.LEARN_MORE, null, new Component(componentType, string2, null, 4, null), null, 43, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit adapter$lambda$2$lambda$1(UiRecommendationsPortfolio.BreakdownRow breakdownRow, RecommendationsWalkthroughSummaryFragment recommendationsWalkthroughSummaryFragment) {
        RecommendationsLearnMoreDialogFragment.Companion companion = RecommendationsLearnMoreDialogFragment.INSTANCE;
        UUID instrumentId = breakdownRow.getInstrumentId();
        Screen.Name name = Screen.Name.RECS_LEARN_MORE;
        String string2 = breakdownRow.getInstrumentId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        String str = null;
        RecommendationsLearnMoreDialogFragment recommendationsLearnMoreDialogFragment = (RecommendationsLearnMoreDialogFragment) companion.newInstance((Parcelable) new RecommendationsLearnMoreDialogFragment.Args(instrumentId, str, new Screen(name, null, string2, null, 10, null), RecommendationsLearnMoreEntryPoint.FIRST_TRADE_RECOMMENDATIONS, null, null, null, 112, null));
        FragmentManager childFragmentManager = recommendationsWalkthroughSummaryFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        recommendationsLearnMoreDialogFragment.show(childFragmentManager, "recs-walkthrough-summary-learn-more");
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return this.eventScreen;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenDisappearEventLogging() {
        return this.excludeFromAutoScreenDisappearEventLogging;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        Toolbar toolbar2 = toolbar.getToolbar();
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        toolbar2.setNavigationIcon(Contexts7.getThemeDrawable(contextRequireContext, C20690R.attr.iconClose24dp));
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        postponeEnterTransition();
        setEnterTransition(ENTER_TRANSITION);
        setSharedElementEnterTransition(new TransitionSet().addTransition(new ChangeBounds()).addTransition(new ChangeTransform()).setInterpolator((TimeInterpolator) new DecelerateInterpolator()).setDuration(600L).addListener((Transition.TransitionListener) new TransitionListenerAdapter() { // from class: com.robinhood.android.recommendations.ui.walkthrough.RecommendationsWalkthroughSummaryFragment.onCreate.1
            @Override // androidx.transition.Transition.TransitionListener
            public /* bridge */ /* synthetic */ void onTransitionEnd(Transition transition, boolean z) {
                super.onTransitionEnd(transition, z);
            }

            @Override // androidx.transition.Transition.TransitionListener
            public /* bridge */ /* synthetic */ void onTransitionStart(Transition transition, boolean z) {
                super.onTransitionStart(transition, z);
            }

            @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
            public void onTransitionEnd(Transition transition) {
                Intrinsics.checkNotNullParameter(transition, "transition");
                RecommendationsWalkthroughSummaryFragment recommendationsWalkthroughSummaryFragment = RecommendationsWalkthroughSummaryFragment.this;
                ImageView orbStatic = recommendationsWalkthroughSummaryFragment.getBinding().orbStatic;
                Intrinsics.checkNotNullExpressionValue(orbStatic, "orbStatic");
                recommendationsWalkthroughSummaryFragment.startUpAnimation(orbStatic);
                RecommendationsWalkthroughSummaryFragment recommendationsWalkthroughSummaryFragment2 = RecommendationsWalkthroughSummaryFragment.this;
                RecommendationsPortfolioView portfolioView = recommendationsWalkthroughSummaryFragment2.getBinding().portfolioView;
                Intrinsics.checkNotNullExpressionValue(portfolioView, "portfolioView");
                recommendationsWalkthroughSummaryFragment2.startUpAnimation(portfolioView);
            }
        }));
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        EventLogger.DefaultImpls.logTap$default(getEventLogger(), UserInteractionEventData.Action.DISMISS, getEventScreen(), new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, null, false, 56, null);
        showExitAlert();
        return true;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Drawable drawable;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Iterator<T> it = ((Args) INSTANCE.getArgs((Fragment) this)).getSharedElements().iterator();
        while (it.hasNext()) {
            Tuples2 tuples2 = (Tuples2) it.next();
            ViewCompat.requireViewById(getBinding().getRoot(), ((Number) tuples2.getFirst()).intValue()).setTransitionName((String) tuples2.getSecond());
        }
        final FragmentRecommendationsWalkthroughSummaryBinding binding = getBinding();
        FrameLayout root = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        BaseFragments2.setContentBelowToolbar(this, root);
        RecommendationsPortfolioView recommendationsPortfolioView = binding.portfolioView;
        recommendationsPortfolioView.setHideShadows(true);
        List<PortfolioBlocksDrawable.Block> portfolioBlocks = ((Args) INSTANCE.getArgs((Fragment) this)).getPortfolioBlocks();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(portfolioBlocks, 10));
        Iterator<T> it2 = portfolioBlocks.iterator();
        while (it2.hasNext()) {
            arrayList.add(Float.valueOf(((PortfolioBlocksDrawable.Block) it2.next()).getWeight()));
        }
        recommendationsPortfolioView.setWeights(arrayList);
        List<PortfolioBlocksDrawable.Block> portfolioBlocks2 = ((Args) INSTANCE.getArgs((Fragment) this)).getPortfolioBlocks();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(portfolioBlocks2, 10));
        Iterator<T> it3 = portfolioBlocks2.iterator();
        while (it3.hasNext()) {
            arrayList2.add(Integer.valueOf(((PortfolioBlocksDrawable.Block) it3.next()).getColor()));
        }
        recommendationsPortfolioView.setBlockColors(arrayList2);
        RhTextView rhTextView = binding.title;
        Companion companion = INSTANCE;
        rhTextView.setText(((Args) companion.getArgs((Fragment) this)).getSummary().getTitle());
        binding.description.setText(((Args) companion.getArgs((Fragment) this)).getSummary().getDescription());
        binding.continueBtn.setText(((Args) companion.getArgs((Fragment) this)).getSummary().getContinueButtonTitle());
        FrameLayout continueBtnContainer = binding.continueBtnContainer;
        Intrinsics.checkNotNullExpressionValue(continueBtnContainer, "continueBtnContainer");
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(continueBtnContainer, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        RecyclerView list = binding.list;
        Intrinsics.checkNotNullExpressionValue(list, "list");
        bindAdapter(list, this.adapter);
        final RecyclerView list2 = binding.list;
        Intrinsics.checkNotNullExpressionValue(list2, "list");
        final ViewTreeObserver viewTreeObserver = list2.getViewTreeObserver();
        viewTreeObserver.addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.robinhood.android.recommendations.ui.walkthrough.RecommendationsWalkthroughSummaryFragment$onViewCreated$lambda$11$$inlined$safeOnPreDraw$1
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                android.content.Context context = list2.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                if (Intrinsics.areEqual(ContextLifecycles.isResumed(context), Boolean.TRUE)) {
                    this.startPostponedEnterTransition();
                }
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnPreDrawListener(this);
                    return true;
                }
                list2.getViewTreeObserver().removeOnPreDrawListener(this);
                return true;
            }
        });
        RdsButton continueBtn = binding.continueBtn;
        Intrinsics.checkNotNullExpressionValue(continueBtn, "continueBtn");
        ViewsKt.eventData$default(continueBtn, false, new Function0() { // from class: com.robinhood.android.recommendations.ui.walkthrough.RecommendationsWalkthroughSummaryFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RecommendationsWalkthroughSummaryFragment.onViewCreated$lambda$11$lambda$8();
            }
        }, 1, null);
        RdsButton continueBtn2 = binding.continueBtn;
        Intrinsics.checkNotNullExpressionValue(continueBtn2, "continueBtn");
        OnClickListeners.onClick(continueBtn2, new Function0() { // from class: com.robinhood.android.recommendations.ui.walkthrough.RecommendationsWalkthroughSummaryFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RecommendationsWalkthroughSummaryFragment.onViewCreated$lambda$11$lambda$9(this.f$0);
            }
        });
        RecommendationsPortfolioView recommendationsPortfolioView2 = binding.portfolioView;
        recommendationsPortfolioView2.setY(recommendationsPortfolioView2.getY() + ORB_Y_DELTA);
        ImageView imageView = binding.orbStatic;
        imageView.setY(imageView.getY() + ORB_Y_DELTA);
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(requireBaseActivity().getDayNightStyleChanges()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.recommendations.ui.walkthrough.RecommendationsWalkthroughSummaryFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecommendationsWalkthroughSummaryFragment.onViewCreated$lambda$11$lambda$10(binding, (DayNightOverlay) obj);
            }
        });
        RdsInfoBannerView rdsInfoBannerView = getBinding().banner;
        BannerComponent infoBanner = ((Args) companion.getArgs((Fragment) this)).getSummary().getInfoBanner();
        RichText title = infoBanner.getTitle();
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        rdsInfoBannerView.setText(RichTexts.toSpannableString$default(title, contextRequireContext, null, false, null, 14, null));
        ServerToBentoAssetMapper2 icon = infoBanner.getIcon();
        if (icon != null) {
            int resourceId = icon.getResourceId();
            Intrinsics.checkNotNull(rdsInfoBannerView);
            drawable = com.robinhood.utils.extensions.ViewsKt.getDrawable(rdsInfoBannerView, resourceId);
        } else {
            drawable = null;
        }
        rdsInfoBannerView.setIcon(drawable);
        GenericAction action = infoBanner.getAction();
        final GenericAction.InfoAlertAction infoAlertAction = action instanceof GenericAction.InfoAlertAction ? (GenericAction.InfoAlertAction) action : null;
        if (infoAlertAction != null) {
            Intrinsics.checkNotNull(rdsInfoBannerView);
            OnClickListeners.onClick(rdsInfoBannerView, new Function0() { // from class: com.robinhood.android.recommendations.ui.walkthrough.RecommendationsWalkthroughSummaryFragment$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RecommendationsWalkthroughSummaryFragment.onViewCreated$lambda$14$lambda$13(this.f$0, infoAlertAction);
                }
            });
        }
        this.adapter.submitList(((Args) companion.getArgs((Fragment) this)).getSummary().getBreakdownRows());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor onViewCreated$lambda$11$lambda$8() {
        return new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.CONTINUE, null, new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, 43, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$11$lambda$9(RecommendationsWalkthroughSummaryFragment recommendationsWalkthroughSummaryFragment) {
        recommendationsWalkthroughSummaryFragment.startOrderFlow();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$11$lambda$10(FragmentRecommendationsWalkthroughSummaryBinding fragmentRecommendationsWalkthroughSummaryBinding, DayNightOverlay it) {
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(it, "it");
        if (DayNightChanges.isDay(it)) {
            i = C25978R.drawable.recs_podium_only_cropped_day;
        } else {
            i = C25978R.drawable.recs_podium_only_cropped_night;
        }
        fragmentRecommendationsWalkthroughSummaryBinding.podiumStatic.setImageResource(i);
        if (DayNightChanges.isDay(it)) {
            i2 = C25978R.drawable.recs_walkthrough_orb_day;
        } else {
            i2 = C25978R.drawable.recs_walkthrough_orb_night;
        }
        fragmentRecommendationsWalkthroughSummaryBinding.orbStatic.setImageResource(i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$14$lambda$13(RecommendationsWalkthroughSummaryFragment recommendationsWalkthroughSummaryFragment, GenericAction.InfoAlertAction infoAlertAction) {
        Navigator.DefaultImpls.createDialogFragment$default(recommendationsWalkthroughSummaryFragment.getNavigator(), new LegacyDialogFragmentKey.ClientComponentAlertSheet(infoAlertAction.getAlert(), true, false, 0, 12, (DefaultConstructorMarker) null), null, 2, null).show(recommendationsWalkthroughSummaryFragment.getChildFragmentManager(), "recs-summary-info-banner");
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == RECS_SUMMARY_REQUEST_CODE && resultCode == -1) {
            getCallbacks().onShowCelebration();
        }
    }

    private final void startOrderFlow() {
        Navigator.DefaultImpls.startActivityForResult$default(getNavigator(), (Fragment) this, (IntentKey) new RecommendationsIntentKeys2("first-trade-recommendations", ((Args) INSTANCE.getArgs((Fragment) this)).getRecommendationId(), null, 4, null), RECS_SUMMARY_REQUEST_CODE, (PerformanceMetricEventData.Source) null, false, (Function1) null, (NavigationType) null, 120, (Object) null);
    }

    private final void showExitAlert() {
        UiRecommendationsPortfolio.Summary summary = ((Args) INSTANCE.getArgs((Fragment) this)).getSummary();
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        RhDialogFragment.Builder id = UiRecommendationPortfolios.createExitAlertDialog(summary, contextRequireContext).setId(C25978R.id.dialog_id_walkthrough_summary_exit_alert);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        RhDialogFragment.Builder.show$default(id, childFragmentManager, "recommendations-exit-dialog", false, 4, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onPositiveButtonClicked(int id, Bundle passthroughArgs) {
        requireActivity().finish();
        EventLogger.DefaultImpls.logTap$default(getEventLogger(), UserInteractionEventData.Action.EXIT_RECS_FLOW, new Screen(getEventScreen().getName(), null, null, null, 14, null), new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, null, false, 56, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startUpAnimation(final View view) {
        view.animate().yBy(UP_DOWN_ANIMATION_VERTICAL_DELTA).setDuration(2000L).setInterpolator(UP_DOWN_ANIMATION_INTERPOLATOR).withEndAction(new Runnable() { // from class: com.robinhood.android.recommendations.ui.walkthrough.RecommendationsWalkthroughSummaryFragment.startUpAnimation.1
            @Override // java.lang.Runnable
            public final void run() {
                RecommendationsWalkthroughSummaryFragment.this.startDownAnimation(view);
            }
        }).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startDownAnimation(final View view) {
        view.animate().yBy(-24.0f).setDuration(2000L).setInterpolator(UP_DOWN_ANIMATION_INTERPOLATOR).withEndAction(new Runnable() { // from class: com.robinhood.android.recommendations.ui.walkthrough.RecommendationsWalkthroughSummaryFragment.startDownAnimation.1
            @Override // java.lang.Runnable
            public final void run() {
                RecommendationsWalkthroughSummaryFragment.this.startUpAnimation(view);
            }
        }).start();
    }

    /* compiled from: RecommendationsWalkthroughSummaryFragment.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b0\u0005\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0006\u0010\u0016\u001a\u00020\tJ\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R#\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/recommendations/ui/walkthrough/RecommendationsWalkthroughSummaryFragment$Args;", "Landroid/os/Parcelable;", ErrorBundle.SUMMARY_ENTRY, "Lcom/robinhood/recommendations/models/ui/UiRecommendationsPortfolio$Summary;", "portfolioBlocks", "", "Lcom/robinhood/android/recommendations/ui/walkthrough/PortfolioBlocksDrawable$Block;", "sharedElements", "Lkotlin/Pair;", "", "", "recommendationId", "Ljava/util/UUID;", "<init>", "(Lcom/robinhood/recommendations/models/ui/UiRecommendationsPortfolio$Summary;Ljava/util/List;Ljava/util/List;Ljava/util/UUID;)V", "getSummary", "()Lcom/robinhood/recommendations/models/ui/UiRecommendationsPortfolio$Summary;", "getPortfolioBlocks", "()Ljava/util/List;", "getSharedElements", "getRecommendationId", "()Ljava/util/UUID;", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Args implements Parcelable {
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final List<PortfolioBlocksDrawable.Block> portfolioBlocks;
        private final UUID recommendationId;
        private final List<Tuples2<Integer, String>> sharedElements;
        private final UiRecommendationsPortfolio.Summary summary;

        /* compiled from: RecommendationsWalkthroughSummaryFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                UiRecommendationsPortfolio.Summary summary = (UiRecommendationsPortfolio.Summary) parcel.readParcelable(Args.class.getClassLoader());
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(PortfolioBlocksDrawable.Block.CREATOR.createFromParcel(parcel));
                }
                int i3 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(parcel.readSerializable());
                }
                return new Args(summary, arrayList, arrayList2, (UUID) parcel.readSerializable());
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
            dest.writeParcelable(this.summary, flags);
            List<PortfolioBlocksDrawable.Block> list = this.portfolioBlocks;
            dest.writeInt(list.size());
            Iterator<PortfolioBlocksDrawable.Block> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
            List<Tuples2<Integer, String>> list2 = this.sharedElements;
            dest.writeInt(list2.size());
            Iterator<Tuples2<Integer, String>> it2 = list2.iterator();
            while (it2.hasNext()) {
                dest.writeSerializable(it2.next());
            }
            dest.writeSerializable(this.recommendationId);
        }

        public Args(UiRecommendationsPortfolio.Summary summary, List<PortfolioBlocksDrawable.Block> portfolioBlocks, List<Tuples2<Integer, String>> sharedElements, UUID recommendationId) {
            Intrinsics.checkNotNullParameter(summary, "summary");
            Intrinsics.checkNotNullParameter(portfolioBlocks, "portfolioBlocks");
            Intrinsics.checkNotNullParameter(sharedElements, "sharedElements");
            Intrinsics.checkNotNullParameter(recommendationId, "recommendationId");
            this.summary = summary;
            this.portfolioBlocks = portfolioBlocks;
            this.sharedElements = sharedElements;
            this.recommendationId = recommendationId;
        }

        public final UiRecommendationsPortfolio.Summary getSummary() {
            return this.summary;
        }

        public final List<PortfolioBlocksDrawable.Block> getPortfolioBlocks() {
            return this.portfolioBlocks;
        }

        public final List<Tuples2<Integer, String>> getSharedElements() {
            return this.sharedElements;
        }

        public final UUID getRecommendationId() {
            return this.recommendationId;
        }
    }

    /* compiled from: RecommendationsWalkthroughSummaryFragment.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/recommendations/ui/walkthrough/RecommendationsWalkthroughSummaryFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/recommendations/ui/walkthrough/RecommendationsWalkthroughSummaryFragment;", "Lcom/robinhood/android/recommendations/ui/walkthrough/RecommendationsWalkthroughSummaryFragment$Args;", "<init>", "()V", "UP_DOWN_ANIMATION_INTERPOLATOR", "Landroid/view/animation/DecelerateInterpolator;", "UP_DOWN_ANIMATION_VERTICAL_DELTA", "", "UP_DOWN_ANIMATION_DURATION", "", "ORB_Y_DELTA", "RECS_SUMMARY_REQUEST_CODE", "", "TRANSITION_DURATION", "ENTER_TRANSITION", "Landroidx/transition/TransitionSet;", "feature-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<RecommendationsWalkthroughSummaryFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(RecommendationsWalkthroughSummaryFragment recommendationsWalkthroughSummaryFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, recommendationsWalkthroughSummaryFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public RecommendationsWalkthroughSummaryFragment newInstance(Args args) {
            return (RecommendationsWalkthroughSummaryFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(RecommendationsWalkthroughSummaryFragment recommendationsWalkthroughSummaryFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, recommendationsWalkthroughSummaryFragment, args);
        }
    }
}
