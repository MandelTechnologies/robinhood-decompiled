package com.robinhood.android.common.options.upsell.alert;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.OneShotPreDrawListener;
import androidx.fragment.app.FragmentManager;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.options.C11303R;
import com.robinhood.android.common.options.databinding.FragmentOptionPostTradeAlertBinding;
import com.robinhood.android.common.options.extensions.Analytics3;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.common.util.extensions.TextViewsKt;
import com.robinhood.android.common.util.text.ActionSpan;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.card.RdsCardView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.extensions.Navigators3;
import com.robinhood.android.regiongate.OptionsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.notification.NotificationUtils;
import com.robinhood.utils.p409ui.lifecycle.ContextLifecycles;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
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

/* compiled from: OptionPostTradeAlertFragment.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 32\u00020\u00012\u00020\u0002:\u00013B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\u001a\u0010#\u001a\u00020 2\u0006\u0010$\u001a\u00020%2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\b\u0010&\u001a\u00020 H\u0016J\u001a\u0010'\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\"H\u0016J\b\u0010+\u001a\u00020 H\u0002J\b\u0010,\u001a\u00020\u001cH\u0016J\t\u0010-\u001a\u00020\u001cH\u0096\u0001R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u0018X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u001cX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010.\u001a\b\u0012\u0004\u0012\u0002000/X\u0096\u0005¢\u0006\u0006\u001a\u0004\b1\u00102¨\u00064"}, m3636d2 = {"Lcom/robinhood/android/common/options/upsell/alert/OptionPostTradeAlertFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "binding", "Lcom/robinhood/android/common/options/databinding/FragmentOptionPostTradeAlertBinding;", "getBinding", "()Lcom/robinhood/android/common/options/databinding/FragmentOptionPostTradeAlertBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/common/options/upsell/alert/OptionAlertOnboardingDuxo;", "getDuxo", "()Lcom/robinhood/android/common/options/upsell/alert/OptionAlertOnboardingDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalytics", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "screenName", "", "getScreenName", "()Ljava/lang/String;", "toolbarVisible", "", "getToolbarVisible", "()Z", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Landroid/view/View;", "onResume", "onPositiveButtonClicked", "id", "", "passthroughArgs", "playSlideInAnimation", "onBackPressed", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-lib-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class OptionPostTradeAlertFragment extends BaseFragment implements RegionGated {
    private final /* synthetic */ RegionGated2 $$delegate_0;
    public AnalyticsLogger analytics;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    private final String screenName;
    private final boolean toolbarVisible;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(OptionPostTradeAlertFragment.class, "binding", "getBinding()Lcom/robinhood/android/common/options/databinding/FragmentOptionPostTradeAlertBinding;", 0))};

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

    public OptionPostTradeAlertFragment() {
        super(C11303R.layout.fragment_option_post_trade_alert);
        this.$$delegate_0 = new RegionGated2(OptionsRegionGate.INSTANCE);
        this.binding = ViewBinding5.viewBinding(this, OptionPostTradeAlertFragment2.INSTANCE);
        this.duxo = OldDuxos.oldDuxo(this, OptionAlertOnboardingDuxo.class);
        this.screenName = AnalyticsStrings.SCREEN_NAME_OPTION_ALERT_POST_TRADE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentOptionPostTradeAlertBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentOptionPostTradeAlertBinding) value;
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

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Analytics3.logScreenAppear$default(getAnalytics(), getScreenName(), null, 2, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        RhTextView setupAlertSummary = getBinding().setupAlertSummary;
        Intrinsics.checkNotNullExpressionValue(setupAlertSummary, "setupAlertSummary");
        String string2 = ViewsKt.getString(setupAlertSummary, C11303R.string.post_trade_option_alert_summary);
        num = num.intValue() == 0 ? null : 0;
        TextViewsKt.setTextWithLearnMore((TextView) setupAlertSummary, (CharSequence) string2, false, true, num != null ? ViewsKt.getString(setupAlertSummary, num.intValue()) : null, (ClickableSpan) new ActionSpan(false, (Function0) new Function0<Unit>() { // from class: com.robinhood.android.common.options.upsell.alert.OptionPostTradeAlertFragment$onViewCreated$$inlined$setTextWithLearnMore$default$1
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                String string3 = this.this$0.getString(C11303R.string.option_alert_onboarding_learn_more_url);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                Navigator navigator = this.this$0.getNavigator();
                Context contextRequireContext = this.this$0.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                Navigators3.showHelpCenterWebViewFragment(navigator, contextRequireContext, string3);
            }
        }, 1, (DefaultConstructorMarker) null));
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        getDuxo().markOptionAlertOnboardingShown();
        playSlideInAnimation();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.options.upsell.alert.OptionPostTradeAlertFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionPostTradeAlertFragment.onResume$lambda$4(this.f$0, (OptionAlertOnboardingViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$4(final OptionPostTradeAlertFragment optionPostTradeAlertFragment, final OptionAlertOnboardingViewState state) {
        Throwable thConsume;
        Intrinsics.checkNotNullParameter(state, "state");
        optionPostTradeAlertFragment.getBinding().okBtn.setLoading(state.isLoading());
        RdsButton rdsButton = optionPostTradeAlertFragment.getBinding().okBtn;
        Context contextRequireContext = optionPostTradeAlertFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        rdsButton.setText(state.getPrimaryButtonText(contextRequireContext));
        RdsButton okBtn = optionPostTradeAlertFragment.getBinding().okBtn;
        Intrinsics.checkNotNullExpressionValue(okBtn, "okBtn");
        OnClickListeners.onClick(okBtn, new Function0() { // from class: com.robinhood.android.common.options.upsell.alert.OptionPostTradeAlertFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionPostTradeAlertFragment.onResume$lambda$4$lambda$1(state, optionPostTradeAlertFragment);
            }
        });
        RdsButton notNowBtn = optionPostTradeAlertFragment.getBinding().notNowBtn;
        Intrinsics.checkNotNullExpressionValue(notNowBtn, "notNowBtn");
        OnClickListeners.onClick(notNowBtn, new Function0() { // from class: com.robinhood.android.common.options.upsell.alert.OptionPostTradeAlertFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionPostTradeAlertFragment.onResume$lambda$4$lambda$2(this.f$0);
            }
        });
        UiEvent<Unit> successEvent = state.getSuccessEvent();
        if ((successEvent != null ? successEvent.consume() : null) != null) {
            optionPostTradeAlertFragment.requireActivity().finish();
        }
        UiEvent<Throwable> failureEvent = state.getFailureEvent();
        if (failureEvent != null && (thConsume = failureEvent.consume()) != null && !AbsErrorHandler.handleError$default(optionPostTradeAlertFragment.getActivityErrorHandler(), thConsume, false, 2, null)) {
            RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
            Context contextRequireContext2 = optionPostTradeAlertFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
            RhDialogFragment.Builder cancelable = companion.create(contextRequireContext2).setId(C11303R.id.alert_onboarding_error).setTitle(C11303R.string.option_alert_onboarding_error_dialog_title, new Object[0]).setMessage(C11303R.string.option_alert_onboarding_error_dialog_message, new Object[0]).setPositiveButton(C11048R.string.general_label_ok, new Object[0]).setCancelable(false);
            FragmentManager supportFragmentManager = optionPostTradeAlertFragment.requireActivity().getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            RhDialogFragment.Builder.show$default(cancelable, supportFragmentManager, "alert-onboarding-error", false, 4, null);
            Analytics3.logScreenAppear(optionPostTradeAlertFragment.getAnalytics(), AnalyticsStrings.SCREEN_NAME_OPTION_ALERT_POST_TRADE_ERROR, "error_message");
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$4$lambda$1(OptionAlertOnboardingViewState optionAlertOnboardingViewState, OptionPostTradeAlertFragment optionPostTradeAlertFragment) {
        Context contextRequireContext = optionPostTradeAlertFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        if (!optionAlertOnboardingViewState.isSystemSettingsEnabled(contextRequireContext)) {
            Context contextRequireContext2 = optionPostTradeAlertFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
            Intent disabledSystemNotificationOrChannelSettingsIntent = NotificationUtils.getDisabledSystemNotificationOrChannelSettingsIntent(contextRequireContext2, optionAlertOnboardingViewState.getChannelId());
            disabledSystemNotificationOrChannelSettingsIntent.addFlags(268435456);
            optionPostTradeAlertFragment.startActivity(disabledSystemNotificationOrChannelSettingsIntent);
            AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(optionPostTradeAlertFragment.getAnalytics(), optionPostTradeAlertFragment.getScreenName(), AnalyticsStrings.BUTTON_TITLE_OPTION_ALERT_GO_TO_SETTINGS, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
        } else {
            optionPostTradeAlertFragment.getDuxo().turnOnOptionAlert();
            AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(optionPostTradeAlertFragment.getAnalytics(), optionPostTradeAlertFragment.getScreenName(), "enable", null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$4$lambda$2(OptionPostTradeAlertFragment optionPostTradeAlertFragment) {
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(optionPostTradeAlertFragment.getAnalytics(), optionPostTradeAlertFragment.getScreenName(), AnalyticsStrings.BUTTON_TITLE_OPTION_ALERT_NOT_NOW, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
        optionPostTradeAlertFragment.requireActivity().finish();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onPositiveButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C11303R.id.alert_onboarding_error) {
            requireActivity().finish();
            return true;
        }
        return super.onPositiveButtonClicked(id, passthroughArgs);
    }

    private final void playSlideInAnimation() {
        final RdsCardView cardView = getBinding().cardView;
        Intrinsics.checkNotNullExpressionValue(cardView, "cardView");
        OneShotPreDrawListener.add(cardView, new Runnable() { // from class: com.robinhood.android.common.options.upsell.alert.OptionPostTradeAlertFragment$playSlideInAnimation$$inlined$doOnPreDraw$1
            @Override // java.lang.Runnable
            public final void run() {
                Context context = this.getContext();
                if (context == null || Intrinsics.areEqual(ContextLifecycles.isResumed(context), Boolean.FALSE)) {
                    return;
                }
                RdsCardView rdsCardView = this.getBinding().cardView;
                rdsCardView.setTranslationY(-this.getBinding().getRoot().getHeight());
                rdsCardView.animate().translationY(0.0f);
            }
        });
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        requireActivity().finish();
        return true;
    }

    /* compiled from: OptionPostTradeAlertFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/common/options/upsell/alert/OptionPostTradeAlertFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/robinhood/android/common/options/upsell/alert/OptionPostTradeAlertFragment;", "feature-lib-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final OptionPostTradeAlertFragment newInstance() {
            return new OptionPostTradeAlertFragment();
        }
    }
}
