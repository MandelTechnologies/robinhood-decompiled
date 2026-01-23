package com.robinhood.android.welcome.rebrand;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcelable;
import android.provider.Settings;
import android.view.View;
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
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.perf.OneTimeUsePerfTrace;
import com.robinhood.android.common.util.AnalyticsTabOnPageChangeListener;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.welcome.C31456R;
import com.robinhood.android.welcome.databinding.FragmentWelcomeRebrandBinding;
import com.robinhood.android.welcome.rebrand.WelcomeRebrandAnimationViewState;
import com.robinhood.android.welcome.rebrand.WelcomeRebrandFragment;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.test.idler.IdlingResourceCounters2;
import com.robinhood.test.idler.IdlingResourceType;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;

/* compiled from: WelcomeRebrandFragment.kt */
@Metadata(m3635d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 Z2\u00020\u00012\u00020\u0002:\u0002YZB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u000109H\u0016J\u001a\u0010:\u001a\u0002072\u0006\u0010;\u001a\u00020<2\b\u00108\u001a\u0004\u0018\u000109H\u0017J\b\u0010=\u001a\u000207H\u0016J\b\u0010>\u001a\u000207H\u0016J\b\u0010?\u001a\u000207H\u0016J\b\u0010@\u001a\u000207H\u0016J\u0010\u0010A\u001a\u00020/2\u0006\u0010B\u001a\u00020CH\u0002J\u0010\u0010D\u001a\u0002032\u0006\u0010B\u001a\u00020CH\u0002J\u0018\u0010E\u001a\u0002072\u0006\u0010B\u001a\u00020C2\u0006\u0010F\u001a\u00020GH\u0002J\b\u0010H\u001a\u000207H\u0002J\u0010\u0010I\u001a\u0002072\u0006\u0010J\u001a\u00020+H\u0002J\b\u0010K\u001a\u000207H\u0002J\u0010\u0010L\u001a\u0002072\u0006\u0010M\u001a\u00020NH\u0002J\b\u0010O\u001a\u000207H\u0002J\"\u0010P\u001a\u000207*\u00020Q2\u0014\u0010R\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010T\u0012\u0004\u0012\u0002070SH\u0002R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\n\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001fX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u000e\u0010\"\u001a\u00020\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R+\u0010$\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\u001f8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b%\u0010!\"\u0004\b&\u0010'R\u000e\u0010*\u001a\u00020+X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020-X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010.\u001a\u00020/X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0014\u00102\u001a\u0002038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u0018\u0010U\u001a\u00020\u001f*\u00020V8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bW\u0010X¨\u0006["}, m3636d2 = {"Lcom/robinhood/android/welcome/rebrand/WelcomeRebrandFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "callbacks", "Lcom/robinhood/android/welcome/rebrand/WelcomeRebrandFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/welcome/rebrand/WelcomeRebrandFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalytics", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "viewPagerAdapter", "Lcom/robinhood/android/welcome/rebrand/WelcomeFragmentRebrandAdapter;", "binding", "Lcom/robinhood/android/welcome/databinding/FragmentWelcomeRebrandBinding;", "getBinding", "()Lcom/robinhood/android/welcome/databinding/FragmentWelcomeRebrandBinding;", "binding$delegate", "toolbarVisible", "", "getToolbarVisible", "()Z", "hasPlayedInitialAnimation", "<set-?>", "systemAnimationsDisabled", "getSystemAnimationsDisabled", "setSystemAnimationsDisabled", "(Z)V", "systemAnimationsDisabled$delegate", "Lkotlin/properties/ReadWriteProperty;", "viewState", "Lcom/robinhood/android/welcome/rebrand/WelcomeRebrandAnimationViewState;", "animationLoadTimeTrace", "Lcom/robinhood/android/common/perf/OneTimeUsePerfTrace;", "screenTag", "", "getScreenTag", "()Ljava/lang/String;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Landroid/view/View;", "onStart", "onResume", "onStop", "onDestroyView", "pageToAnalyticsString", "position", "", "pageToScreen", "onScrollChanged", "positionOffset", "", "onInitialAnimationFinished", "onViewStateChanged", "newViewState", "configViewPager", "playAnimation", "frames", "Lcom/robinhood/android/welcome/rebrand/WelcomeRebrandAnimationViewState$LottieAnimationState;", "playInitialAnimation", "onAnimationEnd", "Lcom/airbnb/lottie/LottieAnimationView;", "block", "Lkotlin/Function1;", "Landroid/animation/Animator;", "areSystemAnimationsDisabled", "Landroid/content/Context;", "getAreSystemAnimationsDisabled", "(Landroid/content/Context;)Z", "Callbacks", "Companion", "feature-welcome_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class WelcomeRebrandFragment extends BaseFragment implements AutoLoggableFragment {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(WelcomeRebrandFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/welcome/rebrand/WelcomeRebrandFragment$Callbacks;", 0)), Reflection.property1(new PropertyReference1Impl(WelcomeRebrandFragment.class, "binding", "getBinding()Lcom/robinhood/android/welcome/databinding/FragmentWelcomeRebrandBinding;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(WelcomeRebrandFragment.class, "systemAnimationsDisabled", "getSystemAnimationsDisabled()Z", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
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
    private WelcomeFragmentRebrandAdapter viewPagerAdapter;
    private WelcomeRebrandAnimationViewState viewState;

    /* compiled from: WelcomeRebrandFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/welcome/rebrand/WelcomeRebrandFragment$Callbacks;", "", "onSignInClicked", "", "loggingTag", "", "onSignUpClicked", "feature-welcome_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
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

    public WelcomeRebrandFragment() {
        super(C31456R.layout.fragment_welcome_rebrand);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.welcome.rebrand.WelcomeRebrandFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (android.content.Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof WelcomeRebrandFragment.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
        this.binding = ViewBinding5.viewBinding(this, WelcomeRebrandFragment2.INSTANCE);
        this.systemAnimationsDisabled = BindSavedState2.savedBoolean(this, false).provideDelegate(this, $$delegatedProperties[2]);
        this.viewState = new WelcomeRebrandAnimationViewState(false, 0, 0.0f, 7, null);
        this.animationLoadTimeTrace = new OneTimeUsePerfTrace(TRACE_NAME);
        this.screenTag = AnalyticsStrings.MAX_WELCOME_TAG;
    }

    private final Callbacks getCallbacks() {
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

    private final FragmentWelcomeRebrandBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[1]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentWelcomeRebrandBinding) value;
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
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        if (getAreSystemAnimationsDisabled(contextRequireContext)) {
            setSystemAnimationsDisabled(true);
        }
        configViewPager();
        getBinding().maxWelcomeDotIndicators.setNumDots(WelcomeRebrandAnimationViewState.INSTANCE.getNUM_WELCOME_MAX_PAGES());
        RdsButton rdsButton = getBinding().maxWelcomeLoginBtn;
        Intrinsics.checkNotNull(rdsButton);
        ViewsKt.setLoggingConfig(rdsButton, new AutoLoggingConfig(false, false, 2, null));
        ViewsKt.eventData$default(rdsButton, false, new Function0() { // from class: com.robinhood.android.welcome.rebrand.WelcomeRebrandFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WelcomeRebrandFragment.onViewCreated$lambda$2$lambda$0();
            }
        }, 1, null);
        OnClickListeners.onClick(rdsButton, new Function0() { // from class: com.robinhood.android.welcome.rebrand.WelcomeRebrandFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WelcomeRebrandFragment.onViewCreated$lambda$2$lambda$1(this.f$0);
            }
        });
        getBinding().maxWelcomeViewPager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() { // from class: com.robinhood.android.welcome.rebrand.WelcomeRebrandFragment.onViewCreated.2
            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                WelcomeRebrandFragment.this.onScrollChanged(position, positionOffset);
            }
        });
        getBinding().maxWelcomeViewPager.registerOnPageChangeCallback(new AnalyticsTabOnPageChangeListener(getAnalytics()) { // from class: com.robinhood.android.welcome.rebrand.WelcomeRebrandFragment.onViewCreated.3
            @Override // com.robinhood.android.common.util.AnalyticsTabOnPageChangeListener
            protected String getTabName(int position) {
                return WelcomeRebrandFragment.this.pageToAnalyticsString(position);
            }
        });
        getBinding().maxWelcomeViewPager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() { // from class: com.robinhood.android.welcome.rebrand.WelcomeRebrandFragment.onViewCreated.4
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
                    EventLogger.DefaultImpls.logSwipe$default(WelcomeRebrandFragment.this.getEventLogger(), null, WelcomeRebrandFragment.this.pageToScreen(this.currentPosition), new Component(Component.ComponentType.CAROUSEL, null, null, 6, null), null, null, false, 57, null);
                }
                this.currentPosition = position;
            }
        });
        ConstraintLayout buttonContainer = getBinding().buttonContainer;
        Intrinsics.checkNotNullExpressionValue(buttonContainer, "buttonContainer");
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(buttonContainer, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        RdsButton rdsButton2 = getBinding().maxWelcomeSignupBtn;
        Intrinsics.checkNotNull(rdsButton2);
        ViewsKt.setLoggingConfig(rdsButton2, new AutoLoggingConfig(false, false, 2, null));
        ViewsKt.eventData$default(rdsButton2, false, new Function0() { // from class: com.robinhood.android.welcome.rebrand.WelcomeRebrandFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WelcomeRebrandFragment.onViewCreated$lambda$5$lambda$3();
            }
        }, 1, null);
        OnClickListeners.onClick(rdsButton2, new Function0() { // from class: com.robinhood.android.welcome.rebrand.WelcomeRebrandFragment$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WelcomeRebrandFragment.onViewCreated$lambda$5$lambda$4(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor onViewCreated$lambda$2$lambda$0() {
        return new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.LOGIN, null, new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, 43, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$2$lambda$1(WelcomeRebrandFragment welcomeRebrandFragment) {
        welcomeRebrandFragment.getCallbacks().onSignInClicked(welcomeRebrandFragment.pageToAnalyticsString(welcomeRebrandFragment.getBinding().maxWelcomeViewPager.getCurrentItem()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor onViewCreated$lambda$5$lambda$3() {
        return new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.SIGN_UP, null, new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, 43, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$5$lambda$4(WelcomeRebrandFragment welcomeRebrandFragment) {
        welcomeRebrandFragment.getCallbacks().onSignUpClicked(welcomeRebrandFragment.pageToAnalyticsString(welcomeRebrandFragment.getBinding().maxWelcomeViewPager.getCurrentItem()));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        BaseActivity baseActivityRequireBaseActivity = requireBaseActivity();
        baseActivityRequireBaseActivity.hideToolbar();
        baseActivityRequireBaseActivity.overrideSystemBarsStyle(false);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.viewState = new WelcomeRebrandAnimationViewState(false, 0, 0.0f, 7, null);
        this.hasPlayedInitialAnimation = false;
        onScrollChanged(getBinding().maxWelcomeViewPager.getCurrentItem(), 0.0f);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        requireBaseActivity().resetSystemBarsStyleOverride();
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        getBinding().maxWelcomeAnimationView.removeAllLottieOnCompositionLoadedListener();
        super.onDestroyView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String pageToAnalyticsString(int position) {
        return WelcomePageRebrand.getEntries().get(position).getAnalyticsString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Screen pageToScreen(int position) {
        return WelcomePageRebrand.getEntries().get(position).getScreen();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onScrollChanged(int position, float positionOffset) {
        int i;
        float f;
        WelcomeRebrandAnimationViewState welcomeRebrandAnimationViewStateCopy$default;
        WelcomeRebrandAnimationViewState welcomeRebrandAnimationViewStateCopy$default2;
        if (position < 0) {
            welcomeRebrandAnimationViewStateCopy$default = WelcomeRebrandAnimationViewState.copy$default(this.viewState, false, 0, 0.0f, 1, null);
        } else {
            WelcomeRebrandAnimationViewState.Companion companion = WelcomeRebrandAnimationViewState.INSTANCE;
            if (position >= companion.getNUM_WELCOME_MAX_PAGES()) {
                welcomeRebrandAnimationViewStateCopy$default = WelcomeRebrandAnimationViewState.copy$default(this.viewState, false, companion.getNUM_WELCOME_MAX_PAGES(), 0.0f, 1, null);
            } else {
                if (!getSystemAnimationsDisabled()) {
                    i = position;
                    f = positionOffset;
                    welcomeRebrandAnimationViewStateCopy$default = WelcomeRebrandAnimationViewState.copy$default(this.viewState, false, i, f, 1, null);
                    welcomeRebrandAnimationViewStateCopy$default2 = welcomeRebrandAnimationViewStateCopy$default;
                    if (i == 0 || f != 0.0f) {
                        welcomeRebrandAnimationViewStateCopy$default2 = WelcomeRebrandAnimationViewState.copy$default(welcomeRebrandAnimationViewStateCopy$default2, true, 0, 0.0f, 6, null);
                    }
                    onViewStateChanged(welcomeRebrandAnimationViewStateCopy$default2);
                }
                welcomeRebrandAnimationViewStateCopy$default = WelcomeRebrandAnimationViewState.copy$default(this.viewState, false, positionOffset >= 0.5f ? position + 1 : position, 0.0f, 1, null);
            }
        }
        i = position;
        f = positionOffset;
        welcomeRebrandAnimationViewStateCopy$default2 = welcomeRebrandAnimationViewStateCopy$default;
        if (i == 0) {
            welcomeRebrandAnimationViewStateCopy$default2 = WelcomeRebrandAnimationViewState.copy$default(welcomeRebrandAnimationViewStateCopy$default2, true, 0, 0.0f, 6, null);
        }
        onViewStateChanged(welcomeRebrandAnimationViewStateCopy$default2);
    }

    private final void onInitialAnimationFinished() {
        this.hasPlayedInitialAnimation = true;
        onViewStateChanged(WelcomeRebrandAnimationViewState.copy$default(this.viewState, true, 0, 0.0f, 6, null));
        IdlingResourceCounters2.setBusy(IdlingResourceType.WELCOME_LOADED, false);
    }

    private final synchronized void onViewStateChanged(WelcomeRebrandAnimationViewState newViewState) {
        try {
            if (!this.hasPlayedInitialAnimation && !newViewState.getHasPlayedInitialAnimation()) {
                getBinding().maxWelcomeAnimationView.addLottieOnCompositionLoadedListener(new LottieOnCompositionLoadedListener() { // from class: com.robinhood.android.welcome.rebrand.WelcomeRebrandFragment.onViewStateChanged.1
                    @Override // com.airbnb.lottie.LottieOnCompositionLoadedListener
                    public final void onCompositionLoaded(LottieComposition lottieComposition) {
                        WelcomeRebrandFragment.this.playInitialAnimation();
                    }
                });
                this.hasPlayedInitialAnimation = true;
            }
            if (newViewState.getHasPlayedInitialAnimation()) {
                getBinding().maxWelcomeDotIndicators.setNumActivated(newViewState.getPageIdx());
                WelcomeRebrandAnimationViewState.LottieAnimationState lottieAnimationState = newViewState.getLottieAnimationState();
                if (lottieAnimationState != null) {
                    playAnimation(lottieAnimationState);
                }
            }
            this.viewState = newViewState;
        } catch (Throwable th) {
            throw th;
        }
    }

    private final void configViewPager() {
        ViewPager2 viewPager2 = getBinding().maxWelcomeViewPager;
        this.viewPagerAdapter = new WelcomeFragmentRebrandAdapter(this);
        Intrinsics.checkNotNull(viewPager2);
        WelcomeFragmentRebrandAdapter welcomeFragmentRebrandAdapter = this.viewPagerAdapter;
        if (welcomeFragmentRebrandAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewPagerAdapter");
            welcomeFragmentRebrandAdapter = null;
        }
        bindAdapter(viewPager2, welcomeFragmentRebrandAdapter);
        viewPager2.setOffscreenPageLimit(1);
    }

    private final void playAnimation(WelcomeRebrandAnimationViewState.LottieAnimationState frames) {
        LottieAnimationView lottieAnimationView = getBinding().maxWelcomeAnimationView;
        lottieAnimationView.removeAllAnimatorListeners();
        lottieAnimationView.cancelAnimation();
        lottieAnimationView.setMinAndMaxFrame(frames.getStartFrame(), frames.getEndFrame());
        lottieAnimationView.setRepeatCount(0);
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
        WelcomeRebrandAnimationViewState.Companion companion = WelcomeRebrandAnimationViewState.INSTANCE;
        lottieAnimationView.setMinAndMaxFrame(companion.getAnimationFrames().get(0).getInitialFrame(), companion.getAnimationFrames().get(0).getInitialLoopingFrame());
        lottieAnimationView.setRepeatCount(0);
        LottieAnimationView maxWelcomeAnimationView = getBinding().maxWelcomeAnimationView;
        Intrinsics.checkNotNullExpressionValue(maxWelcomeAnimationView, "maxWelcomeAnimationView");
        onAnimationEnd(maxWelcomeAnimationView, new Function1() { // from class: com.robinhood.android.welcome.rebrand.WelcomeRebrandFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return WelcomeRebrandFragment.playInitialAnimation$lambda$11$lambda$10(this.f$0, (Animator) obj);
            }
        });
        lottieAnimationView.playAnimation();
        this.animationLoadTimeTrace.stop();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit playInitialAnimation$lambda$11$lambda$10(WelcomeRebrandFragment welcomeRebrandFragment, Animator animator) {
        welcomeRebrandFragment.onInitialAnimationFinished();
        return Unit.INSTANCE;
    }

    private final void onAnimationEnd(LottieAnimationView lottieAnimationView, final Function1<? super Animator, Unit> function1) {
        lottieAnimationView.removeAllAnimatorListeners();
        lottieAnimationView.addAnimatorListener(new AnimatorListenerAdapter() { // from class: com.robinhood.android.welcome.rebrand.WelcomeRebrandFragment.onAnimationEnd.1
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

    /* compiled from: WelcomeRebrandFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/welcome/rebrand/WelcomeRebrandFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithoutArgsCompanion;", "Lcom/robinhood/android/welcome/rebrand/WelcomeRebrandFragment;", "<init>", "()V", "TRACE_NAME", "", "feature-welcome_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithoutArgsCompanion<WelcomeRebrandFragment> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public /* bridge */ /* synthetic */ Parcelable getArgs(Fragment fragment) {
            return (Parcelable) getArgs((WelcomeRebrandFragment) fragment);
        }

        public Void getArgs(WelcomeRebrandFragment welcomeRebrandFragment) {
            return FragmentWithoutArgsCompanion.DefaultImpls.getArgs(this, welcomeRebrandFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCreator
        public WelcomeRebrandFragment newInstance() {
            return (WelcomeRebrandFragment) FragmentWithoutArgsCompanion.DefaultImpls.newInstance(this);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCreator
        public WelcomeRebrandFragment newInstance(Void r1) {
            return (WelcomeRebrandFragment) FragmentWithoutArgsCompanion.DefaultImpls.newInstance(this, r1);
        }
    }
}
