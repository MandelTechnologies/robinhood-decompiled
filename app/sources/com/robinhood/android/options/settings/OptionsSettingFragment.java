package com.robinhood.android.options.settings;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Toast;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.advisory.featureunavailable.AdvisoryFeatureUnavailableContent;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.onboarding.p085ui.BaseScrollableFragment;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.banner.RdsInfoBannerView;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.compose.ScarletComposeInterop;
import com.robinhood.android.designsystem.compose.ThemesFromScarlet;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.instant.p160ui.InstantCashUtils;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.options.contracts.OptionOnboarding;
import com.robinhood.android.options.contracts.OptionOnboarding2;
import com.robinhood.android.options.contracts.OptionsSettingsFragmentKey;
import com.robinhood.android.options.settings.OptionsSettingFragment;
import com.robinhood.android.options.settings.databinding.FragmentOptionsSettingBinding;
import com.robinhood.android.regiongate.OptionsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.OptionLevel;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.scarlet.util.resource.ThemedResourceReference;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.android.C41827R;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.resource.StringResource;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: OptionsSettingFragment.kt */
@Metadata(m3635d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 @2\u00020\u00012\u00020\u0002:\u0001@B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\b\u0010!\u001a\u00020\u001cH\u0016J\u0010\u0010\"\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020$H\u0016J\u0010\u0010%\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020'H\u0002J\u0010\u0010(\u001a\u00020\u001c2\u0006\u0010)\u001a\u00020*H\u0002J\u0010\u0010+\u001a\u00020\u001c2\u0006\u0010,\u001a\u00020-H\u0002J\u0010\u0010.\u001a\u00020\u001c2\u0006\u0010,\u001a\u00020-H\u0002J\b\u0010/\u001a\u00020\u001cH\u0002J\u0012\u00100\u001a\u00020\u001c2\b\u00101\u001a\u0004\u0018\u00010*H\u0002J\u0012\u00102\u001a\u00020\u001c2\b\u00101\u001a\u0004\u0018\u00010*H\u0002J\b\u00103\u001a\u00020\u001cH\u0002J\b\u00104\u001a\u00020\u001cH\u0016J\u001a\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\f2\b\u00108\u001a\u0004\u0018\u00010 H\u0016J\u001a\u00109\u001a\u0002062\u0006\u00107\u001a\u00020\f2\b\u00108\u001a\u0004\u0018\u00010 H\u0016J\t\u0010:\u001a\u000206H\u0096\u0001R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010;\u001a\b\u0012\u0004\u0012\u00020=0<X\u0096\u0005¢\u0006\u0006\u001a\u0004\b>\u0010?¨\u0006A"}, m3636d2 = {"Lcom/robinhood/android/options/settings/OptionsSettingFragment;", "Lcom/robinhood/android/common/onboarding/ui/BaseScrollableFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalytics", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "secondaryButtonStringRes", "", "getSecondaryButtonStringRes", "()Ljava/lang/Integer;", "binding", "Lcom/robinhood/android/options/settings/databinding/FragmentOptionsSettingBinding;", "getBinding", "()Lcom/robinhood/android/options/settings/databinding/FragmentOptionsSettingBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/options/settings/OptionsSettingDuxo;", "getDuxo", "()Lcom/robinhood/android/options/settings/OptionsSettingDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "setViewState", "viewState", "Lcom/robinhood/android/options/settings/OptionsSettingViewState;", "onOptionsUpgradeClicked", "accountNumber", "", "onOptionsUpgradeCashAccountFailureSassy", "instantCashSwitchToMarginIntent", "Landroid/content/Intent;", "onOptionsUpgradeCashAccountFailureMarginRouting", "bindAdvancedOptionLevel", "bindOtherOptionLevel", "optionLevel", "bindRetirementAccount", "onDowngradeClick", "onSecondaryBtnClicked", "onPositiveButtonClicked", "", "id", "passthroughArgs", "onNegativeButtonClicked", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-options-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class OptionsSettingFragment extends BaseScrollableFragment implements RegionGated {
    private static final String INSTANT_CASH_MARGIN_UPGRADE_INTENT = "instant_cash_margin_upgrade_intent";
    private final /* synthetic */ RegionGated2 $$delegate_0;
    public AnalyticsLogger analytics;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    private final int secondaryButtonStringRes;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(OptionsSettingFragment.class, "binding", "getBinding()Lcom/robinhood/android/options/settings/databinding/FragmentOptionsSettingBinding;", 0))};

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

    public OptionsSettingFragment() {
        super(C23695R.layout.fragment_options_setting);
        this.$$delegate_0 = new RegionGated2(OptionsRegionGate.INSTANCE);
        this.secondaryButtonStringRes = C23695R.string.options_setting_remove_options_action;
        this.binding = ViewBinding5.viewBinding(this, OptionsSettingFragment2.INSTANCE);
        this.duxo = OldDuxos.oldDuxo(this, OptionsSettingDuxo.class);
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

    @Override // com.robinhood.android.common.onboarding.p085ui.BaseScrollableFragment
    public Integer getSecondaryButtonStringRes() {
        return Integer.valueOf(this.secondaryButtonStringRes);
    }

    private final FragmentOptionsSettingBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentOptionsSettingBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OptionsSettingDuxo getDuxo() {
        return (OptionsSettingDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.onboarding.p085ui.BaseScrollableFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (((OptionsSettingsFragmentKey) INSTANCE.getArgs((Fragment) this)).isFromDeeplink()) {
            getDuxo().forceRefreshExperiments();
        }
        RdsButton optionsSettingDowngradeBtn = getBinding().optionsSettingDowngradeBtn;
        Intrinsics.checkNotNullExpressionValue(optionsSettingDowngradeBtn, "optionsSettingDowngradeBtn");
        OnClickListeners.onClick(optionsSettingDowngradeBtn, new Function0() { // from class: com.robinhood.android.options.settings.OptionsSettingFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionsSettingFragment.onViewCreated$lambda$0(this.f$0);
            }
        });
        ScarletManager2.overrideStyle$default(getSecondaryBtn(), new ThemedResourceReference(ResourceType.STYLE.INSTANCE, C20690R.attr.secondaryNegativeButtonStyle), false, 2, null);
        getBinding().optionsSettingTradeOnExpirationToggle.onCheckedChanged(new Function1() { // from class: com.robinhood.android.options.settings.OptionsSettingFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionsSettingFragment.onViewCreated$lambda$1(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(OptionsSettingFragment optionsSettingFragment) {
        optionsSettingFragment.onDowngradeClick();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(OptionsSettingFragment optionsSettingFragment, boolean z) throws Resources.NotFoundException {
        String str;
        optionsSettingFragment.getBinding().optionsSettingTradeOnExpirationToggle.setCheckedProgrammatically(!z);
        AnalyticsLogger analytics = optionsSettingFragment.getAnalytics();
        if (z) {
            str = "enable";
        } else {
            str = AnalyticsStrings.BUTTON_FRIDAY_TRADING_SETTING_DISABLE;
        }
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(analytics, AnalyticsStrings.BUTTON_GROUP_FRIDAY_TRADING_SETTING, str, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
        optionsSettingFragment.getDuxo().toggleTradeOnExpiration(z, optionsSettingFragment.getActivityErrorHandler());
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C236881(this));
    }

    /* compiled from: OptionsSettingFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.options.settings.OptionsSettingFragment$onResume$1 */
    /* synthetic */ class C236881 extends FunctionReferenceImpl implements Function1<OptionsSettingViewState, Unit> {
        C236881(Object obj) {
            super(1, obj, OptionsSettingFragment.class, "setViewState", "setViewState(Lcom/robinhood/android/options/settings/OptionsSettingViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(OptionsSettingViewState optionsSettingViewState) throws Throwable {
            invoke2(optionsSettingViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(OptionsSettingViewState p0) throws Throwable {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((OptionsSettingFragment) this.receiver).setViewState(p0);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setElevation(0.0f);
        toolbar.setTitle(C23695R.string.options_setting_title);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setViewState(final OptionsSettingViewState viewState) throws Throwable {
        CharSequence text;
        ChangeOptionLevelState changeOptionLevelStateConsume;
        BaseActivity baseActivity = getBaseActivity();
        Intrinsics.checkNotNull(baseActivity);
        baseActivity.showProgressBar(viewState.getLoading());
        getSecondaryBtn().setEnabled(!viewState.getLoading());
        getBinding().optionsSettingDowngradeBtn.setEnabled(!viewState.getLoading());
        getBinding().optionsSettingUpgradeBtn.setEnabled(!viewState.getLoading());
        AnalyticsLogger.DefaultImpls.logButtonGroupAppear$default(getAnalytics(), AnalyticsStrings.BUTTON_GROUP_FRIDAY_TRADING_SETTING, AnalyticsStrings.BUTTON_FRIDAY_TRADING_SETTING_TOGGLE, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
        getBinding().optionsSettingTradeOnExpirationToggle.setCheckedProgrammatically(viewState.getTradingOnExpirationState().isEnabled());
        RhTextView rhTextView = getBinding().optionsSettingTradeOnExpirationDisclaimer;
        StringResource tradeOnExpirationDisclaimer = viewState.getTradeOnExpirationDisclaimer();
        if (tradeOnExpirationDisclaimer != null) {
            Resources resources = getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            text = tradeOnExpirationDisclaimer.getText(resources);
        } else {
            text = null;
        }
        rhTextView.setText(text);
        final Account account = viewState.getAccount();
        if (account != null) {
            boolean zIsMargin = account.isMargin();
            if (zIsMargin) {
                RdsButton optionsSettingUpgradeBtn = getBinding().optionsSettingUpgradeBtn;
                Intrinsics.checkNotNullExpressionValue(optionsSettingUpgradeBtn, "optionsSettingUpgradeBtn");
                OnClickListeners.onClick(optionsSettingUpgradeBtn, new Function0() { // from class: com.robinhood.android.options.settings.OptionsSettingFragment$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OptionsSettingFragment.setViewState$lambda$5$lambda$2(this.f$0, account);
                    }
                });
            } else {
                if (zIsMargin) {
                    throw new NoWhenBranchMatchedException();
                }
                final FragmentActivity activity = getActivity();
                if (activity != null && !activity.isFinishing()) {
                    RdsButton optionsSettingUpgradeBtn2 = getBinding().optionsSettingUpgradeBtn;
                    Intrinsics.checkNotNullExpressionValue(optionsSettingUpgradeBtn2, "optionsSettingUpgradeBtn");
                    OnClickListeners.onClick(optionsSettingUpgradeBtn2, new Function0() { // from class: com.robinhood.android.options.settings.OptionsSettingFragment$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return OptionsSettingFragment.setViewState$lambda$5$lambda$4(this.f$0, activity, viewState);
                        }
                    });
                }
            }
            OptionLevel optionLevel = OptionLevel.INSTANCE;
            if (!optionLevel.canTradeOptions(account.getOptionLevel())) {
                BaseActivity baseActivity2 = getBaseActivity();
                if (baseActivity2 != null) {
                    baseActivity2.onBackPressed();
                }
            } else if (account.getBrokerageAccountType().isRetirement()) {
                bindRetirementAccount(account.getOptionLevel());
            } else if (optionLevel.isAdvancedLevel(account.getOptionLevel())) {
                bindAdvancedOptionLevel();
            } else {
                bindOtherOptionLevel(account.getOptionLevel());
            }
        }
        UiEvent<ChangeOptionLevelState> changeOptionLevelState = viewState.getChangeOptionLevelState();
        if (changeOptionLevelState != null && (changeOptionLevelStateConsume = changeOptionLevelState.consume()) != null) {
            BaseActivity baseActivity3 = getBaseActivity();
            Intrinsics.checkNotNull(baseActivity3);
            Resources resources2 = getResources();
            Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
            String toastMessage = changeOptionLevelStateConsume.getToastMessage(resources2, viewState.getAccountDisplayNameToShow());
            if (toastMessage != null) {
                Toast.makeText(baseActivity3, toastMessage, 1).show();
            }
            Throwable throwable = changeOptionLevelStateConsume.getThrowable();
            if (throwable != null) {
                ActivityErrorHandler.Companion.handle$default(ActivityErrorHandler.INSTANCE, baseActivity3, throwable, false, false, 0, null, 60, null);
            }
            if (changeOptionLevelStateConsume.getAutoFinish()) {
                baseActivity3.onBackPressed();
            }
        }
        if (viewState.getShortSellingState().getShowShortSellingToggle()) {
            getBinding().optionsSettingShortSellingComposeView.setContent(ComposableLambda3.composableLambdaInstance(-1110316160, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.options.settings.OptionsSettingFragment.setViewState.3

                /* compiled from: OptionsSettingFragment.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.options.settings.OptionsSettingFragment$setViewState$3$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ OptionsSettingViewState $viewState;
                    final /* synthetic */ OptionsSettingFragment this$0;

                    AnonymousClass1(OptionsSettingViewState optionsSettingViewState, OptionsSettingFragment optionsSettingFragment) {
                        this.$viewState = optionsSettingViewState;
                        this.this$0 = optionsSettingFragment;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        invoke(composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer, int i) {
                        if ((i & 3) == 2 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1314523790, i, -1, "com.robinhood.android.options.settings.OptionsSettingFragment.setViewState.<anonymous>.<anonymous> (OptionsSettingFragment.kt:183)");
                        }
                        OptionSettingShortSellingState shortSellingState = this.$viewState.getShortSellingState();
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance = composer.changedInstance(this.this$0);
                        final OptionsSettingFragment optionsSettingFragment = this.this$0;
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1() { // from class: com.robinhood.android.options.settings.OptionsSettingFragment$setViewState$3$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return OptionsSettingFragment.C236903.AnonymousClass1.invoke$lambda$1$lambda$0(optionsSettingFragment, ((Boolean) obj).booleanValue());
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceGroup();
                        OptionsSettingsShortSellingComposable.OptionsSettingsShortSellingComposable(shortSellingState, null, (Function1) objRememberedValue, composer, 0, 2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$1$lambda$0(OptionsSettingFragment optionsSettingFragment, boolean z) {
                        optionsSettingFragment.getDuxo().toggleShortSelling(z, optionsSettingFragment.getActivityErrorHandler());
                        return Unit.INSTANCE;
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer, int i) {
                    if ((i & 3) == 2 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1110316160, i, -1, "com.robinhood.android.options.settings.OptionsSettingFragment.setViewState.<anonymous> (OptionsSettingFragment.kt:182)");
                    }
                    BentoTheme2.BentoTheme(ScarletComposeInterop.themeChangesForCompose(OptionsSettingFragment.this.getScarletManager()), null, ComposableLambda3.rememberComposableLambda(1314523790, true, new AnonymousClass1(viewState, OptionsSettingFragment.this), composer, 54), composer, 384, 2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
        }
        UiEvent<Unit> managedAccountError = viewState.getManagedAccountError();
        if ((managedAccountError != null ? managedAccountError.consume() : null) != null) {
            getBinding().composeView.setContent(ComposableLambda3.composableLambdaInstance(237361193, true, new C236914()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setViewState$lambda$5$lambda$2(OptionsSettingFragment optionsSettingFragment, Account account) {
        optionsSettingFragment.onOptionsUpgradeClicked(account.getAccountNumber());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setViewState$lambda$5$lambda$4(OptionsSettingFragment optionsSettingFragment, FragmentActivity fragmentActivity, OptionsSettingViewState optionsSettingViewState) {
        optionsSettingFragment.getPrimaryBtn().setLoading(false);
        optionsSettingFragment.getDuxo().logSeenCashAccountFailureDialog();
        RhDialogFragment.Builder negativeButton = RhDialogFragment.INSTANCE.create(fragmentActivity).setId(optionsSettingViewState.getUpgradeCashAccountFailureState().getDialogIdRes()).setTitle(optionsSettingViewState.getUpgradeCashAccountFailureState().getTitleTextRes(), new Object[0]).setMessage(optionsSettingViewState.getUpgradeCashAccountFailureState().getMessageTextRes(), new Object[0]).setPositiveButton(optionsSettingViewState.getUpgradeCashAccountFailureState().getPositiveButtonRes(), new Object[0]).setNegativeButton(optionsSettingViewState.getUpgradeCashAccountFailureState().getNegativeButtonRes(), new Object[0]);
        Bundle bundle = new Bundle();
        if (optionsSettingViewState.getInstantCashSwitchToMarginInputParams() != null) {
            Navigator navigator = optionsSettingFragment.getNavigator();
            Context contextRequireContext = optionsSettingFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            bundle.putParcelable(INSTANT_CASH_MARGIN_UPGRADE_INTENT, InstantCashUtils.createIntentForMarginUpgrade(navigator, contextRequireContext, optionsSettingViewState.getInstantCashSwitchToMarginInputParams()));
        }
        RhDialogFragment.Builder theme = negativeButton.setPassthroughArgs(bundle).setTheme(C13997R.style.ThemeOverlay_Robinhood_DesignSystem_Dialog_Monochrome);
        FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        RhDialogFragment.Builder.show$default(theme, supportFragmentManager, "error", false, 4, null);
        return Unit.INSTANCE;
    }

    /* compiled from: OptionsSettingFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.options.settings.OptionsSettingFragment$setViewState$4 */
    static final class C236914 implements Function2<Composer, Integer, Unit> {
        C236914() {
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(237361193, i, -1, "com.robinhood.android.options.settings.OptionsSettingFragment.setViewState.<anonymous> (OptionsSettingFragment.kt:198)");
            }
            Observable<ThemesFromScarlet> observableThemeChangesForCompose = ScarletComposeInterop.themeChangesForCompose(OptionsSettingFragment.this.getScarletManager());
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(OptionsSettingFragment.this);
            final OptionsSettingFragment optionsSettingFragment = OptionsSettingFragment.this;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.options.settings.OptionsSettingFragment$setViewState$4$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OptionsSettingFragment.C236914.invoke$lambda$1$lambda$0(optionsSettingFragment);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            AdvisoryFeatureUnavailableContent.AdvisoryFeatureUnavailableDialog(observableThemeChangesForCompose, (Function0) objRememberedValue, composer, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(OptionsSettingFragment optionsSettingFragment) {
            optionsSettingFragment.requireActivity().finish();
            return Unit.INSTANCE;
        }
    }

    private final void onOptionsUpgradeClicked(String accountNumber) {
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new OptionOnboarding(new OptionOnboarding2.AccountNumber(accountNumber), new OptionOnboarding.OptionOnboardingSource.Legacy("settings"), null, 4, null), null, false, null, null, 60, null);
    }

    private final void onOptionsUpgradeCashAccountFailureSassy(Intent instantCashSwitchToMarginIntent) {
        startActivity(instantCashSwitchToMarginIntent);
    }

    private final void onOptionsUpgradeCashAccountFailureMarginRouting(Intent instantCashSwitchToMarginIntent) {
        instantCashSwitchToMarginIntent.addFlags(268435456);
        startActivity(instantCashSwitchToMarginIntent);
    }

    private final void bindAdvancedOptionLevel() {
        RhTextView optionsSettingSpreadsEnabledTxt = getBinding().optionsSettingSpreadsEnabledTxt;
        Intrinsics.checkNotNullExpressionValue(optionsSettingSpreadsEnabledTxt, "optionsSettingSpreadsEnabledTxt");
        optionsSettingSpreadsEnabledTxt.setVisibility(0);
        RhTextView optionsSettingSpreadsDisabledTxt = getBinding().optionsSettingSpreadsDisabledTxt;
        Intrinsics.checkNotNullExpressionValue(optionsSettingSpreadsDisabledTxt, "optionsSettingSpreadsDisabledTxt");
        optionsSettingSpreadsDisabledTxt.setVisibility(8);
        getBinding().optionsSettingTierTxt.setText(C23695R.string.options_setting_level_3_label);
        RdsButton optionsSettingDowngradeBtn = getBinding().optionsSettingDowngradeBtn;
        Intrinsics.checkNotNullExpressionValue(optionsSettingDowngradeBtn, "optionsSettingDowngradeBtn");
        optionsSettingDowngradeBtn.setVisibility(0);
        RdsButton optionsSettingUpgradeBtn = getBinding().optionsSettingUpgradeBtn;
        Intrinsics.checkNotNullExpressionValue(optionsSettingUpgradeBtn, "optionsSettingUpgradeBtn");
        optionsSettingUpgradeBtn.setVisibility(8);
        RdsInfoBannerView optionsRetirementAccountWarning = getBinding().optionsRetirementAccountWarning;
        Intrinsics.checkNotNullExpressionValue(optionsRetirementAccountWarning, "optionsRetirementAccountWarning");
        optionsRetirementAccountWarning.setVisibility(8);
    }

    private final void bindOtherOptionLevel(String optionLevel) {
        RhTextView optionsSettingSpreadsEnabledTxt = getBinding().optionsSettingSpreadsEnabledTxt;
        Intrinsics.checkNotNullExpressionValue(optionsSettingSpreadsEnabledTxt, "optionsSettingSpreadsEnabledTxt");
        optionsSettingSpreadsEnabledTxt.setVisibility(8);
        RhTextView optionsSettingSpreadsDisabledTxt = getBinding().optionsSettingSpreadsDisabledTxt;
        Intrinsics.checkNotNullExpressionValue(optionsSettingSpreadsDisabledTxt, "optionsSettingSpreadsDisabledTxt");
        optionsSettingSpreadsDisabledTxt.setVisibility(0);
        RdsButton optionsSettingDowngradeBtn = getBinding().optionsSettingDowngradeBtn;
        Intrinsics.checkNotNullExpressionValue(optionsSettingDowngradeBtn, "optionsSettingDowngradeBtn");
        optionsSettingDowngradeBtn.setVisibility(8);
        RdsButton optionsSettingUpgradeBtn = getBinding().optionsSettingUpgradeBtn;
        Intrinsics.checkNotNullExpressionValue(optionsSettingUpgradeBtn, "optionsSettingUpgradeBtn");
        optionsSettingUpgradeBtn.setVisibility(0);
        RdsInfoBannerView optionsRetirementAccountWarning = getBinding().optionsRetirementAccountWarning;
        Intrinsics.checkNotNullExpressionValue(optionsRetirementAccountWarning, "optionsRetirementAccountWarning");
        optionsRetirementAccountWarning.setVisibility(8);
        if (OptionLevel.INSTANCE.isBasicLevel(optionLevel)) {
            getBinding().optionsSettingTierTxt.setText(C23695R.string.options_setting_level_2_label);
        } else {
            getBinding().optionsSettingTierTxt.setText(C41827R.string.general_label_n_a);
        }
    }

    private final void bindRetirementAccount(String optionLevel) {
        RhTextView optionsSettingSpreadsEnabledTxt = getBinding().optionsSettingSpreadsEnabledTxt;
        Intrinsics.checkNotNullExpressionValue(optionsSettingSpreadsEnabledTxt, "optionsSettingSpreadsEnabledTxt");
        optionsSettingSpreadsEnabledTxt.setVisibility(8);
        RhTextView optionsSettingSpreadsDisabledTxt = getBinding().optionsSettingSpreadsDisabledTxt;
        Intrinsics.checkNotNullExpressionValue(optionsSettingSpreadsDisabledTxt, "optionsSettingSpreadsDisabledTxt");
        optionsSettingSpreadsDisabledTxt.setVisibility(0);
        RdsButton optionsSettingDowngradeBtn = getBinding().optionsSettingDowngradeBtn;
        Intrinsics.checkNotNullExpressionValue(optionsSettingDowngradeBtn, "optionsSettingDowngradeBtn");
        optionsSettingDowngradeBtn.setVisibility(8);
        RdsButton optionsSettingUpgradeBtn = getBinding().optionsSettingUpgradeBtn;
        Intrinsics.checkNotNullExpressionValue(optionsSettingUpgradeBtn, "optionsSettingUpgradeBtn");
        optionsSettingUpgradeBtn.setVisibility(8);
        RdsInfoBannerView optionsRetirementAccountWarning = getBinding().optionsRetirementAccountWarning;
        Intrinsics.checkNotNullExpressionValue(optionsRetirementAccountWarning, "optionsRetirementAccountWarning");
        optionsRetirementAccountWarning.setVisibility(0);
        if (OptionLevel.INSTANCE.isBasicLevel(optionLevel)) {
            getBinding().optionsSettingTierTxt.setText(C23695R.string.options_setting_level_2_label);
        } else {
            getBinding().optionsSettingTierTxt.setText(C41827R.string.general_label_n_a);
        }
    }

    private final void onDowngradeClick() {
        RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        RhDialogFragment.Builder negativeButton = companion.create(contextRequireContext).setId(C23695R.id.dialog_id_options_downgrade_to_basic).setTitle(C23695R.string.options_setting_downgrade_to_basic_title, new Object[0]).setMessage(C23695R.string.options_setting_downgrade_to_basic_summary, new Object[0]).setPositiveButton(C11048R.string.general_label_cancel, new Object[0]).setNegativeButton(C23695R.string.options_setting_downgrade_to_basic_confirmation, new Object[0]);
        FragmentManager parentFragmentManager = getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
        RhDialogFragment.Builder.show$default(negativeButton, parentFragmentManager, "options-downgrade", false, 4, null);
    }

    @Override // com.robinhood.android.common.onboarding.p085ui.BaseScrollableFragment
    public void onSecondaryBtnClicked() {
        Observable observableTake = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.options.settings.OptionsSettingFragment.onSecondaryBtnClicked.1
            @Override // io.reactivex.functions.Function
            public final Optional<StringResource> apply(OptionsSettingViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(it.getAccountDisplayNameToShow());
            }
        }).take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableTake), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.options.settings.OptionsSettingFragment$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionsSettingFragment.onSecondaryBtnClicked$lambda$10(this.f$0, (Optional) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onSecondaryBtnClicked$lambda$10(OptionsSettingFragment optionsSettingFragment, Optional optional) {
        String string2;
        StringResource stringResource = (StringResource) optional.component1();
        if (stringResource != null) {
            int i = C23695R.string.options_setting_remove_options_summary_with_account_type;
            Resources resources = optionsSettingFragment.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            string2 = optionsSettingFragment.getString(i, stringResource.getText(resources));
        } else {
            string2 = optionsSettingFragment.getString(C23695R.string.options_setting_remove_options_summary);
        }
        Intrinsics.checkNotNull(string2);
        RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
        Context contextRequireContext = optionsSettingFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        RhDialogFragment.Builder negativeButton = companion.create(contextRequireContext).setId(C23695R.id.dialog_id_options_remove_options).setMessage(string2).setPositiveButton(C11048R.string.general_label_cancel, new Object[0]).setNegativeButton(C23695R.string.options_setting_remove_options_confirmation, new Object[0]);
        FragmentManager parentFragmentManager = optionsSettingFragment.getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
        RhDialogFragment.Builder.show$default(negativeButton, parentFragmentManager, "options-remove-options", false, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v12, types: [android.os.Parcelable] */
    /* JADX WARN: Type inference failed for: r7v4, types: [android.os.Parcelable] */
    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onPositiveButtonClicked(int id, Bundle passthroughArgs) {
        Parcelable parcelable;
        Parcelable parcelable2;
        if (id == C23695R.id.dialog_id_options_downgrade_to_basic || id == C23695R.id.dialog_id_options_remove_options) {
            return true;
        }
        if (id == C23695R.id.dialog_id_upgrade_cash_account_error) {
            if (passthroughArgs != null) {
                if (Build.VERSION.SDK_INT >= 34) {
                    parcelable2 = (Parcelable) passthroughArgs.getParcelable(INSTANT_CASH_MARGIN_UPGRADE_INTENT, Intent.class);
                } else {
                    ?? parcelable3 = passthroughArgs.getParcelable(INSTANT_CASH_MARGIN_UPGRADE_INTENT);
                    parcelable2 = parcelable3 instanceof Intent ? parcelable3 : null;
                }
                intent = (Intent) parcelable2;
            }
            if (intent != null) {
                getDuxo().logDismissEnableSpreads();
            }
            return true;
        }
        if (id != C23695R.id.dialog_id_upgrade_cash_account_error_margin_routing) {
            return super.onPositiveButtonClicked(id, passthroughArgs);
        }
        if (passthroughArgs != null) {
            if (Build.VERSION.SDK_INT >= 34) {
                parcelable = (Parcelable) passthroughArgs.getParcelable(INSTANT_CASH_MARGIN_UPGRADE_INTENT, Intent.class);
            } else {
                ?? parcelable4 = passthroughArgs.getParcelable(INSTANT_CASH_MARGIN_UPGRADE_INTENT);
                parcelable = parcelable4 instanceof Intent ? parcelable4 : null;
            }
            intent = (Intent) parcelable;
        }
        if (intent != null) {
            getDuxo().logLaunchMarginUpgrade();
            onOptionsUpgradeCashAccountFailureMarginRouting(intent);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v12, types: [android.os.Parcelable] */
    /* JADX WARN: Type inference failed for: r7v4, types: [android.os.Parcelable] */
    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onNegativeButtonClicked(int id, Bundle passthroughArgs) {
        Parcelable parcelable;
        Parcelable parcelable2;
        if (id == C23695R.id.dialog_id_options_downgrade_to_basic) {
            getDuxo().downgradeOptionLevel(OptionLevel.LEVEL_2);
            return true;
        }
        if (id == C23695R.id.dialog_id_options_remove_options) {
            getDuxo().downgradeOptionLevel((String) OptionLevel.INSTANCE.getDOWNGRADE());
            return true;
        }
        if (id == C23695R.id.dialog_id_upgrade_cash_account_error) {
            if (passthroughArgs != null) {
                if (Build.VERSION.SDK_INT >= 34) {
                    parcelable2 = (Parcelable) passthroughArgs.getParcelable(INSTANT_CASH_MARGIN_UPGRADE_INTENT, Intent.class);
                } else {
                    ?? parcelable3 = passthroughArgs.getParcelable(INSTANT_CASH_MARGIN_UPGRADE_INTENT);
                    parcelable2 = parcelable3 instanceof Intent ? parcelable3 : null;
                }
                intent = (Intent) parcelable2;
            }
            if (intent != null) {
                getDuxo().logLaunchMarginUpgrade();
                onOptionsUpgradeCashAccountFailureSassy(intent);
            }
            return true;
        }
        if (id != C23695R.id.dialog_id_upgrade_cash_account_error_margin_routing) {
            return super.onNegativeButtonClicked(id, passthroughArgs);
        }
        if (passthroughArgs != null) {
            if (Build.VERSION.SDK_INT >= 34) {
                parcelable = (Parcelable) passthroughArgs.getParcelable(INSTANT_CASH_MARGIN_UPGRADE_INTENT, Intent.class);
            } else {
                ?? parcelable4 = passthroughArgs.getParcelable(INSTANT_CASH_MARGIN_UPGRADE_INTENT);
                parcelable = parcelable4 instanceof Intent ? parcelable4 : null;
            }
            intent = (Intent) parcelable;
        }
        if (intent != null) {
            getDuxo().logDismissEnableSpreads();
        }
        return true;
    }

    /* compiled from: OptionsSettingFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/options/settings/OptionsSettingFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/options/settings/OptionsSettingFragment;", "Lcom/robinhood/android/options/contracts/OptionsSettingsFragmentKey;", "<init>", "()V", "INSTANT_CASH_MARGIN_UPGRADE_INTENT", "", "feature-options-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<OptionsSettingFragment, OptionsSettingsFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(OptionsSettingsFragmentKey optionsSettingsFragmentKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, optionsSettingsFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public OptionsSettingsFragmentKey getArgs(OptionsSettingFragment optionsSettingFragment) {
            return (OptionsSettingsFragmentKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, optionsSettingFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public OptionsSettingFragment newInstance(OptionsSettingsFragmentKey optionsSettingsFragmentKey) {
            return (OptionsSettingFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, optionsSettingsFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(OptionsSettingFragment optionsSettingFragment, OptionsSettingsFragmentKey optionsSettingsFragmentKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, optionsSettingFragment, optionsSettingsFragmentKey);
        }
    }
}
