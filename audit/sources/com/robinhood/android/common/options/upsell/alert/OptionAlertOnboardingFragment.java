package com.robinhood.android.common.options.upsell.alert;

import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.airbnb.lottie.LottieAnimationView;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.onboarding.C11287R;
import com.robinhood.android.common.onboarding.p085ui.BaseFullscreenInfoFragment;
import com.robinhood.android.common.onboarding.p085ui.SplashPage;
import com.robinhood.android.common.options.C11303R;
import com.robinhood.android.common.options.extensions.Analytics3;
import com.robinhood.android.common.options.upsell.alert.OptionAlertOnboardingFragment;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.Compat;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.extensions.Navigators3;
import com.robinhood.android.options.contracts.OptionAlertOnboardingSource;
import com.robinhood.android.regiongate.OptionsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.util.extensions.LottieAnimationViewsKt;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.OptionOnboardingContext;
import com.robinhood.rosetta.eventlogging.OptionsEligibilityContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.remote.assets.LottieUrl;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.notification.NotificationUtils;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: OptionAlertOnboardingFragment.kt */
@Metadata(m3635d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 G2\u00020\u00012\u00020\u00022\u00020\u0003:\u0003EFGB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010,\u001a\u00020-H\u0016J\u0010\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u000200H\u0016J\u0012\u00101\u001a\u00020-2\b\u00102\u001a\u0004\u0018\u000103H\u0016J\b\u00104\u001a\u00020-H\u0016J\u0010\u00105\u001a\u00020-2\u0006\u00106\u001a\u000207H\u0002J\u001a\u00108\u001a\u00020-2\u0006\u00109\u001a\u00020:2\b\u00102\u001a\u0004\u0018\u000103H\u0017J\u001a\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020)2\b\u0010>\u001a\u0004\u0018\u000103H\u0016J\t\u0010?\u001a\u00020<H\u0096\u0001R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u0019X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020)X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0018\u0010@\u001a\b\u0012\u0004\u0012\u00020B0AX\u0096\u0005¢\u0006\u0006\u001a\u0004\bC\u0010D¨\u0006H"}, m3636d2 = {"Lcom/robinhood/android/common/options/upsell/alert/OptionAlertOnboardingFragment;", "Lcom/robinhood/android/common/onboarding/ui/BaseFullscreenInfoFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "callbacks", "Lcom/robinhood/android/common/options/upsell/alert/OptionAlertOnboardingFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/common/options/upsell/alert/OptionAlertOnboardingFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/common/options/upsell/alert/OptionAlertOnboardingDuxo;", "getDuxo", "()Lcom/robinhood/android/common/options/upsell/alert/OptionAlertOnboardingDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalytics", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "screenName", "", "getScreenName", "()Ljava/lang/String;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "screenEventData", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData;", "getScreenEventData", "()Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData;", "splashPage", "Lcom/robinhood/android/common/onboarding/ui/SplashPage;", "getSplashPage", "()Lcom/robinhood/android/common/onboarding/ui/SplashPage;", "secondaryButtonLabelRes", "", "getSecondaryButtonLabelRes", "()Ljava/lang/Integer;", "onSecondaryButtonClicked", "", "onAttach", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "bindState", "state", "Lcom/robinhood/android/common/options/upsell/alert/OptionAlertOnboardingViewState;", "onViewCreated", "view", "Landroid/view/View;", "onPositiveButtonClicked", "", "id", "passthroughArgs", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Args", "Companion", "feature-lib-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class OptionAlertOnboardingFragment extends BaseFullscreenInfoFragment implements AutoLoggableFragment, RegionGated {
    private static final int ANIMATION_SPEED_FPS = 60;
    private static final int FRAME_BALL_HITS_PHONE = 46;
    private static final int FRAME_BALL_LEAVES_PHONE = 68;
    private static final int FRAME_BALL_START_DROPPING = 30;
    private static final int FRAME_ERROR_MARGIN = 10;
    private static final int MAX_FRAME_FOR_LOOP = 836;
    private static final int MIN_FRAME_FOR_LOOP = 320;
    private static final long VIBRATION_DURATION = 366;
    public AnalyticsLogger analytics;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(OptionAlertOnboardingFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/common/options/upsell/alert/OptionAlertOnboardingFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(OptionsRegionGate.INSTANCE);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.common.options.upsell.alert.OptionAlertOnboardingFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof OptionAlertOnboardingFragment.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = OldDuxos.oldDuxo(this, OptionAlertOnboardingDuxo.class);
    private final String screenName = AnalyticsStrings.SCREEN_NAME_OPTION_ALERT_ONBOARDING;
    private final int secondaryButtonLabelRes = C11303R.string.option_alert_onboarding_negative_button;

    /* compiled from: OptionAlertOnboardingFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/common/options/upsell/alert/OptionAlertOnboardingFragment$Callbacks;", "", "onOptionAlertOnboardingFinished", "", "isFailure", "", "feature-lib-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onOptionAlertOnboardingFinished(boolean isFailure);
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
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
    public com.robinhood.rosetta.eventlogging.Context getScreenEventContext() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventContext(this);
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    private final OptionAlertOnboardingDuxo getDuxo() {
        return (OptionAlertOnboardingDuxo) this.duxo.getValue();
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

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenName() {
        return this.screenName;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return new Screen(Screen.Name.OPTION_ONBOARDING_UPSELL_ALERT, null, getScreenName(), null, 10, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        String string2;
        Screen eventScreen = getEventScreen();
        Companion companion = INSTANCE;
        String eligibilitySource = ((Args) companion.getArgs((Fragment) this)).getEligibilitySource();
        if (eligibilitySource == null) {
            eligibilitySource = "";
        }
        OptionsEligibilityContext optionsEligibilityContext = new OptionsEligibilityContext(eligibilitySource, null, 2, 0 == true ? 1 : 0);
        UUID refId = ((Args) companion.getArgs((Fragment) this)).getRefId();
        return new UserInteractionEventData(null, eventScreen, null, null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, optionsEligibilityContext, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new OptionOnboardingContext(null, null, (refId == null || (string2 = refId.toString()) == null) ? "" : string2, null, 11, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1025, -1, -65, 16383, null), null, null, 109, null);
    }

    @Override // com.robinhood.android.common.onboarding.p085ui.BaseFullscreenInfoFragment
    public SplashPage getSplashPage() {
        SplashPage.Creative.RemoteLottie remoteLottie = new SplashPage.Creative.RemoteLottie(LottieUrl.OPTIONS_ALERT_ONBOARDING);
        String string2 = getString(C11303R.string.option_alert_onboarding_title);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        String string3 = getString(C11303R.string.option_alert_onboarding_summary);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        return new SplashPage(remoteLottie, null, string2, string3, new Function0() { // from class: com.robinhood.android.common.options.upsell.alert.OptionAlertOnboardingFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionAlertOnboardingFragment._get_splashPage_$lambda$0(this.f$0);
            }
        }, null, 34, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _get_splashPage_$lambda$0(OptionAlertOnboardingFragment optionAlertOnboardingFragment) {
        String string2 = optionAlertOnboardingFragment.getString(C11303R.string.option_alert_onboarding_learn_more_url);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        Navigator navigator = optionAlertOnboardingFragment.getNavigator();
        Context contextRequireContext = optionAlertOnboardingFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigators3.showHelpCenterWebViewFragment(navigator, contextRequireContext, string2);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.onboarding.p085ui.BaseFullscreenInfoFragment
    public Integer getSecondaryButtonLabelRes() {
        return Integer.valueOf(this.secondaryButtonLabelRes);
    }

    @Override // com.robinhood.android.common.onboarding.p085ui.BaseFullscreenInfoFragment
    public void onSecondaryButtonClicked() {
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(getAnalytics(), getScreenName(), AnalyticsStrings.BUTTON_TITLE_OPTION_ALERT_NOT_NOW, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
        getCallbacks().onOptionAlertOnboardingFinished(false);
    }

    @Override // com.robinhood.android.common.onboarding.p085ui.BaseFullscreenInfoFragment, com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        setScarletContextWrapper(null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Analytics3.logScreenAppear(getAnalytics(), getScreenName(), OptionAlertOnboardingFragment2.toAnalyticsString(((Args) INSTANCE.getArgs((Fragment) this)).getAnalyticsSource()));
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C114761(this));
    }

    /* compiled from: OptionAlertOnboardingFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.common.options.upsell.alert.OptionAlertOnboardingFragment$onResume$1 */
    /* synthetic */ class C114761 extends FunctionReferenceImpl implements Function1<OptionAlertOnboardingViewState, Unit> {
        C114761(Object obj) {
            super(1, obj, OptionAlertOnboardingFragment.class, "bindState", "bindState(Lcom/robinhood/android/common/options/upsell/alert/OptionAlertOnboardingViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(OptionAlertOnboardingViewState optionAlertOnboardingViewState) {
            invoke2(optionAlertOnboardingViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(OptionAlertOnboardingViewState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((OptionAlertOnboardingFragment) this.receiver).bindState(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindState(final OptionAlertOnboardingViewState state) {
        Throwable thConsume;
        final RdsButton primaryButton = getPrimaryButton();
        if (primaryButton != null) {
            primaryButton.setVisibility(0);
            Context context = primaryButton.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            primaryButton.setText(state.getPrimaryButtonText(context));
            primaryButton.setLoading(state.isLoading());
            OnClickListeners.onClick(primaryButton, new Function0() { // from class: com.robinhood.android.common.options.upsell.alert.OptionAlertOnboardingFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OptionAlertOnboardingFragment.bindState$lambda$2$lambda$1(state, primaryButton, this);
                }
            });
        }
        UiEvent<Unit> successEvent = state.getSuccessEvent();
        if ((successEvent != null ? successEvent.consume() : null) != null) {
            getCallbacks().onOptionAlertOnboardingFinished(false);
        }
        UiEvent<Throwable> failureEvent = state.getFailureEvent();
        if (failureEvent == null || (thConsume = failureEvent.consume()) == null || AbsErrorHandler.handleError$default(getActivityErrorHandler(), thConsume, false, 2, null)) {
            return;
        }
        RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        RhDialogFragment.Builder cancelable = companion.create(contextRequireContext).setId(C11303R.id.alert_onboarding_error).setTitle(C11303R.string.option_alert_onboarding_error_dialog_title, new Object[0]).setMessage(C11303R.string.option_alert_onboarding_error_dialog_message, new Object[0]).setPositiveButton(C11048R.string.general_label_ok, new Object[0]).setCancelable(false);
        FragmentManager supportFragmentManager = requireActivity().getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        RhDialogFragment.Builder.show$default(cancelable, supportFragmentManager, "alert-onboarding-error", false, 4, null);
        Analytics3.logScreenAppear(getAnalytics(), AnalyticsStrings.SCREEN_NAME_OPTION_ALERT_ONBOARDING_ERROR, "error_message");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindState$lambda$2$lambda$1(OptionAlertOnboardingViewState optionAlertOnboardingViewState, RdsButton rdsButton, OptionAlertOnboardingFragment optionAlertOnboardingFragment) {
        Context context = rdsButton.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        if (!optionAlertOnboardingViewState.isSystemSettingsEnabled(context)) {
            AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(optionAlertOnboardingFragment.getAnalytics(), optionAlertOnboardingFragment.getScreenName(), AnalyticsStrings.BUTTON_TITLE_OPTION_ALERT_GO_TO_SETTINGS, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
            Context context2 = rdsButton.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            Intent disabledSystemNotificationOrChannelSettingsIntent = NotificationUtils.getDisabledSystemNotificationOrChannelSettingsIntent(context2, optionAlertOnboardingViewState.getChannelId());
            disabledSystemNotificationOrChannelSettingsIntent.addFlags(268435456);
            optionAlertOnboardingFragment.startActivity(disabledSystemNotificationOrChannelSettingsIntent);
        } else {
            AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(optionAlertOnboardingFragment.getAnalytics(), optionAlertOnboardingFragment.getScreenName(), "enable", null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
            optionAlertOnboardingFragment.getDuxo().markOptionAlertOnboardingShown();
            optionAlertOnboardingFragment.getDuxo().turnOnOptionAlert();
        }
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.onboarding.p085ui.BaseFullscreenInfoFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    @TargetApi(26)
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        final LottieAnimationView lottieAnimationView = (LottieAnimationView) view.findViewById(C11287R.id.splash_page_image);
        Intrinsics.checkNotNull(lottieAnimationView);
        LottieAnimationViewsKt.addEndingInfiniteLoop(lottieAnimationView, 320, Integer.valueOf(MAX_FRAME_FOR_LOOP));
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        final Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
        lottieAnimationView.addAnimatorUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.robinhood.android.common.options.upsell.alert.OptionAlertOnboardingFragment.onViewCreated.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator it) {
                Intrinsics.checkNotNullParameter(it, "it");
                if (!booleanRef.element && Math.abs(lottieAnimationView.getFrame() - 30) < 10) {
                    lottieAnimationView.performHapticFeedback(1);
                    booleanRef.element = true;
                }
                if (booleanRef2.element || Math.abs(lottieAnimationView.getFrame() - 46) >= 10) {
                    return;
                }
                Object systemService = this.requireActivity().getSystemService("vibrator");
                Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.os.Vibrator");
                Vibrator vibrator = (Vibrator) systemService;
                if (Compat.INSTANCE.isApiSupported(26)) {
                    vibrator.vibrate(VibrationEffect.createOneShot(OptionAlertOnboardingFragment.VIBRATION_DURATION, -1));
                } else {
                    vibrator.vibrate(OptionAlertOnboardingFragment.VIBRATION_DURATION);
                }
                booleanRef2.element = true;
            }
        });
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onPositiveButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C11303R.id.alert_onboarding_error) {
            getCallbacks().onOptionAlertOnboardingFinished(true);
            return true;
        }
        return super.onPositiveButtonClicked(id, passthroughArgs);
    }

    /* compiled from: OptionAlertOnboardingFragment.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/common/options/upsell/alert/OptionAlertOnboardingFragment$Args;", "Landroid/os/Parcelable;", "analyticsSource", "Lcom/robinhood/android/options/contracts/OptionAlertOnboardingSource;", "eligibilitySource", "", "refId", "Ljava/util/UUID;", "<init>", "(Lcom/robinhood/android/options/contracts/OptionAlertOnboardingSource;Ljava/lang/String;Ljava/util/UUID;)V", "getAnalyticsSource", "()Lcom/robinhood/android/options/contracts/OptionAlertOnboardingSource;", "getEligibilitySource", "()Ljava/lang/String;", "getRefId", "()Ljava/util/UUID;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-lib-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final OptionAlertOnboardingSource analyticsSource;
        private final String eligibilitySource;
        private final UUID refId;

        /* compiled from: OptionAlertOnboardingFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(OptionAlertOnboardingSource.valueOf(parcel.readString()), parcel.readString(), (UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, OptionAlertOnboardingSource optionAlertOnboardingSource, String str, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                optionAlertOnboardingSource = args.analyticsSource;
            }
            if ((i & 2) != 0) {
                str = args.eligibilitySource;
            }
            if ((i & 4) != 0) {
                uuid = args.refId;
            }
            return args.copy(optionAlertOnboardingSource, str, uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final OptionAlertOnboardingSource getAnalyticsSource() {
            return this.analyticsSource;
        }

        /* renamed from: component2, reason: from getter */
        public final String getEligibilitySource() {
            return this.eligibilitySource;
        }

        /* renamed from: component3, reason: from getter */
        public final UUID getRefId() {
            return this.refId;
        }

        public final Args copy(OptionAlertOnboardingSource analyticsSource, String eligibilitySource, UUID refId) {
            Intrinsics.checkNotNullParameter(analyticsSource, "analyticsSource");
            return new Args(analyticsSource, eligibilitySource, refId);
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
            return this.analyticsSource == args.analyticsSource && Intrinsics.areEqual(this.eligibilitySource, args.eligibilitySource) && Intrinsics.areEqual(this.refId, args.refId);
        }

        public int hashCode() {
            int iHashCode = this.analyticsSource.hashCode() * 31;
            String str = this.eligibilitySource;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            UUID uuid = this.refId;
            return iHashCode2 + (uuid != null ? uuid.hashCode() : 0);
        }

        public String toString() {
            return "Args(analyticsSource=" + this.analyticsSource + ", eligibilitySource=" + this.eligibilitySource + ", refId=" + this.refId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.analyticsSource.name());
            dest.writeString(this.eligibilitySource);
            dest.writeSerializable(this.refId);
        }

        public Args(OptionAlertOnboardingSource analyticsSource, String str, UUID uuid) {
            Intrinsics.checkNotNullParameter(analyticsSource, "analyticsSource");
            this.analyticsSource = analyticsSource;
            this.eligibilitySource = str;
            this.refId = uuid;
        }

        public final OptionAlertOnboardingSource getAnalyticsSource() {
            return this.analyticsSource;
        }

        public final String getEligibilitySource() {
            return this.eligibilitySource;
        }

        public final UUID getRefId() {
            return this.refId;
        }
    }

    /* compiled from: OptionAlertOnboardingFragment.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/common/options/upsell/alert/OptionAlertOnboardingFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/common/options/upsell/alert/OptionAlertOnboardingFragment;", "Lcom/robinhood/android/common/options/upsell/alert/OptionAlertOnboardingFragment$Args;", "<init>", "()V", "MIN_FRAME_FOR_LOOP", "", "MAX_FRAME_FOR_LOOP", "FRAME_BALL_START_DROPPING", "FRAME_BALL_HITS_PHONE", "FRAME_BALL_LEAVES_PHONE", "ANIMATION_SPEED_FPS", "FRAME_ERROR_MARGIN", "VIBRATION_DURATION", "", "feature-lib-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<OptionAlertOnboardingFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(OptionAlertOnboardingFragment optionAlertOnboardingFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, optionAlertOnboardingFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public OptionAlertOnboardingFragment newInstance(Args args) {
            return (OptionAlertOnboardingFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(OptionAlertOnboardingFragment optionAlertOnboardingFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, optionAlertOnboardingFragment, args);
        }
    }
}
