package com.robinhood.android.welcome;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.Settings;
import android.text.Spannable;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.widget.ViewPager2;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieOnCompositionLoadedListener;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.autoeventlogging.AutoLoggingConfig;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.autoeventlogging.ViewsKt;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.DotIndicators;
import com.robinhood.android.common.perf.OneTimeUsePerfTrace;
import com.robinhood.android.common.util.AnalyticsTabOnPageChangeListener;
import com.robinhood.android.common.util.HtmlCompat2;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.welcome.WelcomeAnimationViewState;
import com.robinhood.android.welcome.WelcomeFragment;
import com.robinhood.android.welcome.databinding.FragmentWelcomeBinding;
import com.robinhood.android.welcome.databinding.IncludeMaxWelcomeBottomSheetBinding;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.test.idler.IdlingResourceCounters2;
import com.robinhood.test.idler.IdlingResourceType;
import com.robinhood.utils.p409ui.color.ThemeColors;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: WelcomeFragment.kt */
@Metadata(m3635d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 ^2\u00020\u00012\u00020\u0002:\u0003\\]^B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u000109H\u0016J\u001a\u0010:\u001a\u0002072\u0006\u0010;\u001a\u00020<2\b\u00108\u001a\u0004\u0018\u000109H\u0017J\b\u0010=\u001a\u000207H\u0016J\b\u0010>\u001a\u000207H\u0016J\b\u0010?\u001a\u000207H\u0016J\u0010\u0010@\u001a\u00020/2\u0006\u0010A\u001a\u00020BH\u0002J\u0010\u0010C\u001a\u0002032\u0006\u0010A\u001a\u00020BH\u0002J\u0018\u0010D\u001a\u0002072\u0006\u0010A\u001a\u00020B2\u0006\u0010E\u001a\u00020FH\u0002J\b\u0010G\u001a\u000207H\u0002J\u0010\u0010H\u001a\u0002072\u0006\u0010I\u001a\u00020+H\u0002J\u0010\u0010J\u001a\u0002072\u0006\u0010K\u001a\u00020\u001fH\u0002J\b\u0010L\u001a\u000207H\u0002J\u0010\u0010M\u001a\u0002072\u0006\u0010N\u001a\u00020BH\u0002J\u0010\u0010O\u001a\u0002072\u0006\u0010P\u001a\u00020QH\u0002J\b\u0010R\u001a\u000207H\u0002J\"\u0010S\u001a\u000207*\u00020T2\u0014\u0010U\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010W\u0012\u0004\u0012\u0002070VH\u0002R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\n\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001fX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u000e\u0010\"\u001a\u00020\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R+\u0010$\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\u001f8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b%\u0010!\"\u0004\b&\u0010'R\u000e\u0010*\u001a\u00020+X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020-X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010.\u001a\u00020/X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0014\u00102\u001a\u0002038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u0018\u0010X\u001a\u00020\u001f*\u00020Y8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010[¨\u0006_"}, m3636d2 = {"Lcom/robinhood/android/welcome/WelcomeFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "callbacks", "Lcom/robinhood/android/welcome/WelcomeFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/welcome/WelcomeFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalytics", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "viewPagerAdapter", "Lcom/robinhood/android/welcome/WelcomeFragmentAdapter;", "binding", "Lcom/robinhood/android/welcome/databinding/FragmentWelcomeBinding;", "getBinding", "()Lcom/robinhood/android/welcome/databinding/FragmentWelcomeBinding;", "binding$delegate", "toolbarVisible", "", "getToolbarVisible", "()Z", "hasPlayedInitialAnimation", "<set-?>", "systemAnimationsDisabled", "getSystemAnimationsDisabled", "setSystemAnimationsDisabled", "(Z)V", "systemAnimationsDisabled$delegate", "Lkotlin/properties/ReadWriteProperty;", "viewState", "Lcom/robinhood/android/welcome/WelcomeAnimationViewState;", "animationLoadTimeTrace", "Lcom/robinhood/android/common/perf/OneTimeUsePerfTrace;", "screenTag", "", "getScreenTag", "()Ljava/lang/String;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Landroid/view/View;", "onStart", "onResume", "onDestroyView", "pageToAnalyticsString", "position", "", "pageToScreen", "onScrollChanged", "positionOffset", "", "onInitialAnimationFinished", "onViewStateChanged", "newViewState", "setChildBottomSheetVisible", "isVisible", "configViewPager", "playTargetFrame", "targetFrame", "playLoopingAnimation", "frames", "Lcom/robinhood/android/welcome/WelcomeAnimationViewState$LottieAnimationState$Looping;", "playInitialAnimation", "onAnimationEnd", "Lcom/airbnb/lottie/LottieAnimationView;", "block", "Lkotlin/Function1;", "Landroid/animation/Animator;", "areSystemAnimationsDisabled", "Landroid/content/Context;", "getAreSystemAnimationsDisabled", "(Landroid/content/Context;)Z", "Callbacks", "Args", "Companion", "feature-welcome_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes20.dex */
public final class WelcomeFragment extends BaseFragment implements AutoLoggableFragment {
    private static final String TRACE_NAME = "welcomeAnimation";
    public AnalyticsLogger analytics;
    private final OneTimeUsePerfTrace animationLoadTimeTrace;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    public EventLogger eventLogger;
    private boolean hasPlayedInitialAnimation;
    private final String screenTag;

    /* renamed from: systemAnimationsDisabled$delegate, reason: from kotlin metadata */
    private final Interfaces3 systemAnimationsDisabled;
    private final boolean toolbarVisible;
    private WelcomeFragmentAdapter viewPagerAdapter;
    private WelcomeAnimationViewState viewState;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(WelcomeFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/welcome/WelcomeFragment$Callbacks;", 0)), Reflection.property1(new PropertyReference1Impl(WelcomeFragment.class, "binding", "getBinding()Lcom/robinhood/android/welcome/databinding/FragmentWelcomeBinding;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(WelcomeFragment.class, "systemAnimationsDisabled", "getSystemAnimationsDisabled()Z", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final WelcomePage BOTTOM_SHEET_PAGE = WelcomePage.PAGE_TWO;

    /* compiled from: WelcomeFragment.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/welcome/WelcomeFragment$Callbacks;", "", "onSignInClicked", "", "loggingTag", "", "onSignUpClicked", "stateChanges", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/android/welcome/WelcomeState;", "getStateChanges", "()Lkotlinx/coroutines/flow/Flow;", "feature-welcome_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        Flow<WelcomeState> getStateChanges();

        void onSignInClicked(String loggingTag);

        void onSignUpClicked(String loggingTag);
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

    public WelcomeFragment() {
        super(C31456R.layout.fragment_welcome);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.welcome.WelcomeFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (android.content.Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof WelcomeFragment.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
        this.binding = ViewBinding5.viewBinding(this, WelcomeFragment2.INSTANCE);
        this.systemAnimationsDisabled = BindSavedState2.savedBoolean(this, false).provideDelegate(this, $$delegatedProperties[2]);
        this.viewState = new WelcomeAnimationViewState(false, 0, 0.0f, 7, null);
        this.animationLoadTimeTrace = new OneTimeUsePerfTrace(TRACE_NAME);
        this.screenTag = AnalyticsStrings.MAX_WELCOME_TAG;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    public final AnalyticsLogger getAnalytics() {
        AnalyticsLogger analyticsLogger = this.analytics;
        if (analyticsLogger != null) {
            return analyticsLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analytics");
        return null;
    }

    public final void setAnalytics(AnalyticsLogger analyticsLogger) {
        Intrinsics.checkNotNullParameter(analyticsLogger, "<set-?>");
        this.analytics = analyticsLogger;
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
    public final FragmentWelcomeBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[1]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentWelcomeBinding) value;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    private final boolean getSystemAnimationsDisabled() {
        return ((Boolean) this.systemAnimationsDisabled.getValue(this, $$delegatedProperties[2])).booleanValue();
    }

    private final void setSystemAnimationsDisabled(boolean z) {
        this.systemAnimationsDisabled.setValue(this, $$delegatedProperties[2], Boolean.valueOf(z));
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenTag() {
        return this.screenTag;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        int currentItem;
        try {
            currentItem = getBinding().maxWelcomeViewPager.getCurrentItem();
        } catch (Exception unused) {
            currentItem = 0;
        }
        return pageToScreen(currentItem);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        IdlingResourceCounters2.setBusy(IdlingResourceType.WELCOME_LOADED, true);
        if (savedInstanceState == null) {
            this.animationLoadTimeTrace.start();
        }
        super.onCreate(savedInstanceState);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    @SuppressLint({"ClickableViewAccessibility"})
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Spannable spannableFromHtml$default;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        if (getAreSystemAnimationsDisabled(contextRequireContext)) {
            setSystemAnimationsDisabled(true);
        }
        MotionLayout motionLayout = getBinding().root;
        android.content.Context contextRequireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
        motionLayout.setBackgroundColor(ThemeColors.getThemeColor(contextRequireContext2, C13997R.attr.paletteColorBiomeDark));
        MotionLayout motionLayout2 = getBinding().root;
        android.content.Context contextRequireContext3 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "requireContext(...)");
        motionLayout2.setBackgroundTintList(ColorStateList.valueOf(ThemeColors.getThemeColor(contextRequireContext3, C13997R.attr.paletteColorBiomeDark)));
        configViewPager();
        Companion companion = INSTANCE;
        if (((Args) companion.getArgs((Fragment) this)).getHideSwipey()) {
            DotIndicators maxWelcomeDotIndicators = getBinding().maxWelcomeDotIndicators;
            Intrinsics.checkNotNullExpressionValue(maxWelcomeDotIndicators, "maxWelcomeDotIndicators");
            maxWelcomeDotIndicators.setVisibility(8);
        } else {
            getBinding().maxWelcomeDotIndicators.setNumDots(WelcomeAnimationViewState.INSTANCE.getNUM_WELCOME_MAX_PAGES());
        }
        RdsButton rdsButton = getBinding().maxWelcomeLoginBtn;
        Intrinsics.checkNotNull(rdsButton);
        ViewsKt.setLoggingConfig(rdsButton, new AutoLoggingConfig(false, false, 2, null));
        ViewsKt.eventData$default(rdsButton, false, new Function0() { // from class: com.robinhood.android.welcome.WelcomeFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WelcomeFragment.onViewCreated$lambda$2$lambda$0();
            }
        }, 1, null);
        OnClickListeners.onClick(rdsButton, new Function0() { // from class: com.robinhood.android.welcome.WelcomeFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WelcomeFragment.onViewCreated$lambda$2$lambda$1(this.f$0);
            }
        });
        getBinding().maxWelcomeViewPager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() { // from class: com.robinhood.android.welcome.WelcomeFragment.onViewCreated.2
            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                WelcomeFragment.this.onScrollChanged(position, positionOffset);
            }
        });
        getBinding().maxWelcomeViewPager.registerOnPageChangeCallback(new AnalyticsTabOnPageChangeListener(getAnalytics()) { // from class: com.robinhood.android.welcome.WelcomeFragment.onViewCreated.3
            @Override // com.robinhood.android.common.util.AnalyticsTabOnPageChangeListener
            protected String getTabName(int position) {
                return WelcomeFragment.this.pageToAnalyticsString(position);
            }
        });
        getBinding().maxWelcomeViewPager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() { // from class: com.robinhood.android.welcome.WelcomeFragment.onViewCreated.4
            private int currentPosition = -1;

            public final int getCurrentPosition() {
                return this.currentPosition;
            }

            public final void setCurrentPosition(int i) {
                this.currentPosition = i;
            }

            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                int i = this.currentPosition;
                if (i != position && i != -1) {
                    EventLogger.DefaultImpls.logSwipe$default(WelcomeFragment.this.getEventLogger(), null, WelcomeFragment.this.pageToScreen(this.currentPosition), new Component(Component.ComponentType.CAROUSEL, null, null, 6, null), null, null, false, 57, null);
                }
                this.currentPosition = position;
            }
        });
        if (((Args) companion.getArgs((Fragment) this)).getHideSwipey()) {
            RhTextView rhTextView = getBinding().maxWelcomeIntroSubtitle;
            Resources resources = getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            rhTextView.setText(HtmlCompat2.fromHtml$default(resources, C31456R.string.welcome_max_no_swipey_subtitle, 0, 2, null));
        } else {
            RhTextView rhTextView2 = getBinding().maxWelcomeIntroSubtitle;
            Resources resources2 = getResources();
            Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
            rhTextView2.setText(HtmlCompat2.fromHtml$default(resources2, C31456R.string.welcome_max_subtitle, 0, 2, null));
        }
        ConstraintLayout buttonContainer = getBinding().buttonContainer;
        Intrinsics.checkNotNullExpressionValue(buttonContainer, "buttonContainer");
        InsetSides.Companion companion2 = InsetSides.INSTANCE;
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(buttonContainer, companion2.m26679getBottomXedK2Rk());
        IncludeMaxWelcomeBottomSheetBinding includeMaxWelcomeBottomSheetBinding = getBinding().maxWelcomeBottomSheet;
        RhTextView rhTextView3 = includeMaxWelcomeBottomSheetBinding.maxWelcomeFeatureTitle;
        WelcomePage welcomePage = BOTTOM_SHEET_PAGE;
        rhTextView3.setText(getString(welcomePage.getTitleRes()));
        includeMaxWelcomeBottomSheetBinding.maxWelcomeFeatureSubtitle.setText(getString(welcomePage.getSubtitleRes()));
        RhTextView rhTextView4 = includeMaxWelcomeBottomSheetBinding.maxWelcomeFeatureDisclosure;
        Integer disclosureRes = welcomePage.getDisclosureRes();
        if (disclosureRes != null) {
            int iIntValue = disclosureRes.intValue();
            Resources resources3 = getResources();
            Intrinsics.checkNotNullExpressionValue(resources3, "getResources(...)");
            spannableFromHtml$default = HtmlCompat2.fromHtml$default(resources3, iIntValue, 0, 2, null);
        } else {
            spannableFromHtml$default = null;
        }
        rhTextView4.setText(spannableFromHtml$default);
        RhTextView maxWelcomeFeatureDisclosure = includeMaxWelcomeBottomSheetBinding.maxWelcomeFeatureDisclosure;
        Intrinsics.checkNotNullExpressionValue(maxWelcomeFeatureDisclosure, "maxWelcomeFeatureDisclosure");
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(maxWelcomeFeatureDisclosure, companion2.m26679getBottomXedK2Rk());
        RdsButton rdsButton2 = getBinding().maxWelcomeSignupBtn;
        Intrinsics.checkNotNull(rdsButton2);
        ViewsKt.setLoggingConfig(rdsButton2, new AutoLoggingConfig(false, false, 2, null));
        ViewsKt.eventData$default(rdsButton2, false, new Function0() { // from class: com.robinhood.android.welcome.WelcomeFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WelcomeFragment.onViewCreated$lambda$7$lambda$5();
            }
        }, 1, null);
        OnClickListeners.onClick(rdsButton2, new Function0() { // from class: com.robinhood.android.welcome.WelcomeFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WelcomeFragment.onViewCreated$lambda$7$lambda$6(this.f$0);
            }
        });
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C314707(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor onViewCreated$lambda$2$lambda$0() {
        return new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.LOGIN, null, new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, 43, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$2$lambda$1(WelcomeFragment welcomeFragment) {
        welcomeFragment.getCallbacks().onSignInClicked(welcomeFragment.pageToAnalyticsString(welcomeFragment.getBinding().maxWelcomeViewPager.getCurrentItem()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor onViewCreated$lambda$7$lambda$5() {
        return new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.SIGN_UP, null, new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, 43, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$7$lambda$6(WelcomeFragment welcomeFragment) {
        welcomeFragment.getCallbacks().onSignUpClicked(welcomeFragment.pageToAnalyticsString(welcomeFragment.getBinding().maxWelcomeViewPager.getCurrentItem()));
        return Unit.INSTANCE;
    }

    /* compiled from: WelcomeFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.welcome.WelcomeFragment$onViewCreated$7", m3645f = "WelcomeFragment.kt", m3646l = {211}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.welcome.WelcomeFragment$onViewCreated$7 */
    /* loaded from: classes9.dex */
    static final class C314707 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C314707(Continuation<? super C314707> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return WelcomeFragment.this.new C314707(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C314707) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: WelcomeFragment.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "state", "Lcom/robinhood/android/welcome/WelcomeState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.welcome.WelcomeFragment$onViewCreated$7$1", m3645f = "WelcomeFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.welcome.WelcomeFragment$onViewCreated$7$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<WelcomeState, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ WelcomeFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(WelcomeFragment welcomeFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = welcomeFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(WelcomeState welcomeState, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(welcomeState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Integer subtitleOverrideRes = ((WelcomeState) this.L$0).getSubtitleOverrideRes();
                if (subtitleOverrideRes != null) {
                    WelcomeFragment welcomeFragment = this.this$0;
                    int iIntValue = subtitleOverrideRes.intValue();
                    RhTextView rhTextView = welcomeFragment.getBinding().maxWelcomeIntroSubtitle;
                    Resources resources = welcomeFragment.getResources();
                    Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                    rhTextView.setText(HtmlCompat2.fromHtml$default(resources, iIntValue, 0, 2, null));
                }
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<WelcomeState> stateChanges = WelcomeFragment.this.getCallbacks().getStateChanges();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(WelcomeFragment.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateChanges, anonymousClass1, this) == coroutine_suspended) {
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

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        requireBaseActivity().hideToolbar();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.viewState = new WelcomeAnimationViewState(false, 0, 0.0f, 7, null);
        this.hasPlayedInitialAnimation = false;
        onScrollChanged(getBinding().maxWelcomeViewPager.getCurrentItem(), 0.0f);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        getBinding().maxWelcomeAnimationView.removeAllLottieOnCompositionLoadedListener();
        super.onDestroyView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String pageToAnalyticsString(int position) {
        if (position == 0) {
            return AnalyticsStrings.TAB_MAX_WELCOME;
        }
        return WelcomePage.values()[position - 1].getAnalyticsString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Screen pageToScreen(int position) {
        if (position == 0) {
            return new Screen(Screen.Name.WELCOME_MAIN, null, null, null, 14, null);
        }
        return WelcomePage.values()[position - 1].getScreen();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onScrollChanged(int position, float positionOffset) {
        int i;
        float f;
        WelcomeAnimationViewState welcomeAnimationViewStateCopy$default;
        WelcomeAnimationViewState welcomeAnimationViewStateCopy$default2;
        if (position < 0) {
            welcomeAnimationViewStateCopy$default = WelcomeAnimationViewState.copy$default(this.viewState, false, 0, 0.0f, 1, null);
        } else {
            WelcomeAnimationViewState.Companion companion = WelcomeAnimationViewState.INSTANCE;
            if (position >= companion.getNUM_WELCOME_MAX_PAGES()) {
                welcomeAnimationViewStateCopy$default = WelcomeAnimationViewState.copy$default(this.viewState, false, companion.getNUM_WELCOME_MAX_PAGES(), 0.0f, 1, null);
            } else {
                if (!getSystemAnimationsDisabled()) {
                    i = position;
                    f = positionOffset;
                    welcomeAnimationViewStateCopy$default = WelcomeAnimationViewState.copy$default(this.viewState, false, i, f, 1, null);
                    welcomeAnimationViewStateCopy$default2 = welcomeAnimationViewStateCopy$default;
                    if (i == 0 || f != 0.0f) {
                        welcomeAnimationViewStateCopy$default2 = WelcomeAnimationViewState.copy$default(welcomeAnimationViewStateCopy$default2, true, 0, 0.0f, 6, null);
                    }
                    onViewStateChanged(welcomeAnimationViewStateCopy$default2);
                }
                welcomeAnimationViewStateCopy$default = WelcomeAnimationViewState.copy$default(this.viewState, false, positionOffset >= 0.5f ? position + 1 : position, 0.0f, 1, null);
            }
        }
        i = position;
        f = positionOffset;
        welcomeAnimationViewStateCopy$default2 = welcomeAnimationViewStateCopy$default;
        if (i == 0) {
            welcomeAnimationViewStateCopy$default2 = WelcomeAnimationViewState.copy$default(welcomeAnimationViewStateCopy$default2, true, 0, 0.0f, 6, null);
        }
        onViewStateChanged(welcomeAnimationViewStateCopy$default2);
    }

    private final void onInitialAnimationFinished() {
        this.hasPlayedInitialAnimation = true;
        onViewStateChanged(WelcomeAnimationViewState.copy$default(this.viewState, true, 0, 0.0f, 6, null));
        IdlingResourceCounters2.setBusy(IdlingResourceType.WELCOME_LOADED, false);
    }

    private final synchronized void onViewStateChanged(WelcomeAnimationViewState newViewState) {
        try {
            if (!this.hasPlayedInitialAnimation && !newViewState.getHasPlayedInitialAnimation()) {
                getBinding().maxWelcomeAnimationView.addLottieOnCompositionLoadedListener(new LottieOnCompositionLoadedListener() { // from class: com.robinhood.android.welcome.WelcomeFragment.onViewStateChanged.1
                    @Override // com.airbnb.lottie.LottieOnCompositionLoadedListener
                    public final void onCompositionLoaded(LottieComposition lottieComposition) {
                        WelcomeFragment.this.playInitialAnimation();
                    }
                });
                this.hasPlayedInitialAnimation = true;
            }
            if (newViewState.getHasPlayedInitialAnimation()) {
                getBinding().maxWelcomeDotIndicators.setNumActivated(newViewState.getPageIdx());
                WelcomeAnimationViewState.LottieAnimationState lottieAnimationState = newViewState.getLottieAnimationState();
                if (lottieAnimationState instanceof WelcomeAnimationViewState.LottieAnimationState.Looping) {
                    playLoopingAnimation((WelcomeAnimationViewState.LottieAnimationState.Looping) lottieAnimationState);
                } else if (lottieAnimationState instanceof WelcomeAnimationViewState.LottieAnimationState.TargetFrame) {
                    playTargetFrame(((WelcomeAnimationViewState.LottieAnimationState.TargetFrame) lottieAnimationState).getTargetFrame());
                } else if (lottieAnimationState != null) {
                    throw new NoWhenBranchMatchedException();
                }
                WelcomeAnimationViewState.ColorInterpolation backgroundColorInterpolation = newViewState.getBackgroundColorInterpolation();
                if (backgroundColorInterpolation != null) {
                    android.content.Context contextRequireContext = requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                    int color = backgroundColorInterpolation.getColor(contextRequireContext);
                    MotionLayout motionLayout = getBinding().root;
                    motionLayout.setBackgroundColor(color);
                    motionLayout.setBackgroundTintList(ColorStateList.valueOf(color));
                    motionLayout.setBackgroundTintMode(PorterDuff.Mode.SRC_IN);
                }
                WelcomeAnimationViewState.ColorInterpolation dotIndicatorBackgroundColorInterpolation = newViewState.getDotIndicatorBackgroundColorInterpolation();
                if (dotIndicatorBackgroundColorInterpolation != null) {
                    android.content.Context contextRequireContext2 = requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
                    getBinding().maxWelcomeDotIndicators.setDotColor(dotIndicatorBackgroundColorInterpolation.getColor(contextRequireContext2));
                }
                WelcomeAnimationViewState.MotionLayoutAnimationState motionLayoutAnimationState = newViewState.getMotionLayoutAnimationState();
                if (motionLayoutAnimationState != null) {
                    if (getBinding().root.getStartState() != motionLayoutAnimationState.getStartId() || getBinding().root.getEndState() != motionLayoutAnimationState.getEndId()) {
                        getBinding().root.setState(motionLayoutAnimationState.getStartId(), getBinding().root.getWidth(), getBinding().root.getHeight());
                        getBinding().root.transitionToState(motionLayoutAnimationState.getEndId());
                    }
                    getBinding().root.setInterpolatedProgress(motionLayoutAnimationState.getProgress());
                }
                setChildBottomSheetVisible(newViewState.getViewPagerBottomSheetVisible());
            }
            this.viewState = newViewState;
        } catch (Throwable th) {
            throw th;
        }
    }

    private final void setChildBottomSheetVisible(boolean isVisible) {
        List<Fragment> fragments = getChildFragmentManager().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : fragments) {
            if (obj instanceof WelcomeFeatureFragment) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((WelcomeFeatureFragment) it.next()).toggleBottomSheet(1, isVisible);
        }
    }

    private final void configViewPager() {
        ViewPager2 viewPager2 = getBinding().maxWelcomeViewPager;
        this.viewPagerAdapter = new WelcomeFragmentAdapter(this, ((Args) INSTANCE.getArgs((Fragment) this)).getHideSwipey());
        Intrinsics.checkNotNull(viewPager2);
        WelcomeFragmentAdapter welcomeFragmentAdapter = this.viewPagerAdapter;
        if (welcomeFragmentAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewPagerAdapter");
            welcomeFragmentAdapter = null;
        }
        bindAdapter(viewPager2, welcomeFragmentAdapter);
        viewPager2.setOffscreenPageLimit(1);
    }

    private final void playTargetFrame(int targetFrame) {
        LottieAnimationView lottieAnimationView = getBinding().maxWelcomeAnimationView;
        lottieAnimationView.removeAllAnimatorListeners();
        lottieAnimationView.cancelAnimation();
        lottieAnimationView.setMinAndMaxFrame(targetFrame, targetFrame);
        lottieAnimationView.setFrame(targetFrame);
    }

    private final void playLoopingAnimation(WelcomeAnimationViewState.LottieAnimationState.Looping frames) {
        LottieAnimationView lottieAnimationView = getBinding().maxWelcomeAnimationView;
        lottieAnimationView.removeAllAnimatorListeners();
        lottieAnimationView.cancelAnimation();
        lottieAnimationView.setMinAndMaxFrame(frames.getStartFrame(), frames.getEndFrame());
        lottieAnimationView.setRepeatCount(-1);
        lottieAnimationView.playAnimation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void playInitialAnimation() {
        if (isRemoving() || isDetached()) {
            return;
        }
        if (getSystemAnimationsDisabled()) {
            onInitialAnimationFinished();
            this.animationLoadTimeTrace.stop();
            return;
        }
        LottieAnimationView lottieAnimationView = getBinding().maxWelcomeAnimationView;
        WelcomeAnimationViewState.Companion companion = WelcomeAnimationViewState.INSTANCE;
        lottieAnimationView.setMinAndMaxFrame(companion.getAnimationFrames().get(0).getInitialFrame(), companion.getAnimationFrames().get(0).getInitialLoopingFrame());
        lottieAnimationView.setRepeatCount(0);
        LottieAnimationView maxWelcomeAnimationView = getBinding().maxWelcomeAnimationView;
        Intrinsics.checkNotNullExpressionValue(maxWelcomeAnimationView, "maxWelcomeAnimationView");
        onAnimationEnd(maxWelcomeAnimationView, new Function1() { // from class: com.robinhood.android.welcome.WelcomeFragment$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return WelcomeFragment.playInitialAnimation$lambda$17$lambda$16(this.f$0, (Animator) obj);
            }
        });
        lottieAnimationView.playAnimation();
        MotionLayout motionLayout = getBinding().root;
        motionLayout.setState(C31456R.id.max_welcome_intro_animation_begin, getBinding().root.getWidth(), getBinding().root.getHeight());
        motionLayout.transitionToState(C31456R.id.max_welcome_intro_animation_end);
        this.animationLoadTimeTrace.stop();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit playInitialAnimation$lambda$17$lambda$16(WelcomeFragment welcomeFragment, Animator animator) {
        welcomeFragment.onInitialAnimationFinished();
        return Unit.INSTANCE;
    }

    private final void onAnimationEnd(LottieAnimationView lottieAnimationView, final Function1<? super Animator, Unit> function1) {
        lottieAnimationView.removeAllAnimatorListeners();
        lottieAnimationView.addAnimatorListener(new AnimatorListenerAdapter() { // from class: com.robinhood.android.welcome.WelcomeFragment.onAnimationEnd.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                function1.invoke(animation);
            }
        });
    }

    private final boolean getAreSystemAnimationsDisabled(android.content.Context context) {
        return Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f) == 0.0f;
    }

    /* compiled from: WelcomeFragment.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/welcome/WelcomeFragment$Args;", "Landroid/os/Parcelable;", "hideSwipey", "", "<init>", "(Z)V", "getHideSwipey", "()Z", "component1", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-welcome_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final boolean hideSwipey;

        /* compiled from: WelcomeFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public Args() {
            this(false, 1, null);
        }

        public static /* synthetic */ Args copy$default(Args args, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = args.hideSwipey;
            }
            return args.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getHideSwipey() {
            return this.hideSwipey;
        }

        public final Args copy(boolean hideSwipey) {
            return new Args(hideSwipey);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Args) && this.hideSwipey == ((Args) other).hideSwipey;
        }

        public int hashCode() {
            return Boolean.hashCode(this.hideSwipey);
        }

        public String toString() {
            return "Args(hideSwipey=" + this.hideSwipey + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.hideSwipey ? 1 : 0);
        }

        public Args(boolean z) {
            this.hideSwipey = z;
        }

        public /* synthetic */ Args(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z);
        }

        public final boolean getHideSwipey() {
            return this.hideSwipey;
        }
    }

    /* compiled from: WelcomeFragment.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/welcome/WelcomeFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/welcome/WelcomeFragment;", "Lcom/robinhood/android/welcome/WelcomeFragment$Args;", "<init>", "()V", "BOTTOM_SHEET_PAGE", "Lcom/robinhood/android/welcome/WelcomePage;", "TRACE_NAME", "", "feature-welcome_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<WelcomeFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(WelcomeFragment welcomeFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, welcomeFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public WelcomeFragment newInstance(Args args) {
            return (WelcomeFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(WelcomeFragment welcomeFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, welcomeFragment, args);
        }
    }
}
