package com.robinhood.android.settings.p254ui.preferences;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.common.util.transition.ToolbarScrollAnimator;
import com.robinhood.android.designsystem.colorscheme.ColorSchemeManager;
import com.robinhood.android.designsystem.prefs.Theme;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.designsystem.style.ColorScheme;
import com.robinhood.android.navigation.FragmentResolverCompanion;
import com.robinhood.android.settings.C28315R;
import com.robinhood.android.settings.databinding.FragmentAppearancePreferencesBinding;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.prefs.EnumPreference;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.shared.settings.contracts.AppearancePreferencesFragmentKey;
import com.robinhood.shared.settings.iibsettings.AppearancePreferencesCallbacks;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Tuples2;
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

/* compiled from: AppearancePreferencesFragment.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 52\u00020\u0001:\u00015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/H\u0016J\b\u00100\u001a\u00020-H\u0016J\b\u00101\u001a\u00020-H\u0016J\u0010\u00102\u001a\u00020-2\u0006\u00103\u001a\u000204H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001b\u0010\u001d\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\t\u001a\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u001b\u0010&\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b(\u0010)¨\u00066"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/preferences/AppearancePreferencesFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "<init>", "()V", "binding", "Lcom/robinhood/android/settings/databinding/FragmentAppearancePreferencesBinding;", "getBinding", "()Lcom/robinhood/android/settings/databinding/FragmentAppearancePreferencesBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalytics", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "themePreference", "Lcom/robinhood/prefs/EnumPreference;", "Lcom/robinhood/android/designsystem/prefs/Theme;", "getThemePreference", "()Lcom/robinhood/prefs/EnumPreference;", "setThemePreference", "(Lcom/robinhood/prefs/EnumPreference;)V", "colorSchemeManager", "Lcom/robinhood/android/designsystem/colorscheme/ColorSchemeManager;", "getColorSchemeManager", "()Lcom/robinhood/android/designsystem/colorscheme/ColorSchemeManager;", "setColorSchemeManager", "(Lcom/robinhood/android/designsystem/colorscheme/ColorSchemeManager;)V", "callbacks", "Lcom/robinhood/shared/settings/iibsettings/AppearancePreferencesCallbacks;", "getCallbacks", "()Lcom/robinhood/shared/settings/iibsettings/AppearancePreferencesCallbacks;", "callbacks$delegate", "screenName", "", "getScreenName", "()Ljava/lang/String;", "toolbarScrollAnimator", "Lcom/robinhood/android/common/util/transition/ToolbarScrollAnimator;", "getToolbarScrollAnimator", "()Lcom/robinhood/android/common/util/transition/ToolbarScrollAnimator;", "toolbarScrollAnimator$delegate", "Lkotlin/Lazy;", "onAttach", "", "context", "Landroid/content/Context;", "onStart", "onResume", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "Companion", "feature-settings_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class AppearancePreferencesFragment extends BaseFragment {
    public AnalyticsLogger analytics;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    public ColorSchemeManager colorSchemeManager;
    public EnumPreference<Theme> themePreference;

    /* renamed from: toolbarScrollAnimator$delegate, reason: from kotlin metadata */
    private final Lazy toolbarScrollAnimator;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(AppearancePreferencesFragment.class, "binding", "getBinding()Lcom/robinhood/android/settings/databinding/FragmentAppearancePreferencesBinding;", 0)), Reflection.property1(new PropertyReference1Impl(AppearancePreferencesFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/shared/settings/iibsettings/AppearancePreferencesCallbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public AppearancePreferencesFragment() {
        super(C28315R.layout.fragment_appearance_preferences);
        this.binding = ViewBinding5.viewBinding(this, AppearancePreferencesFragment2.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(AppearancePreferencesCallbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.settings.ui.preferences.AppearancePreferencesFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
        this.toolbarScrollAnimator = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0() { // from class: com.robinhood.android.settings.ui.preferences.AppearancePreferencesFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AppearancePreferencesFragment.toolbarScrollAnimator_delegate$lambda$0(this.f$0);
            }
        });
    }

    private final FragmentAppearancePreferencesBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentAppearancePreferencesBinding) value;
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

    public final EnumPreference<Theme> getThemePreference() {
        EnumPreference<Theme> enumPreference = this.themePreference;
        if (enumPreference != null) {
            return enumPreference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("themePreference");
        return null;
    }

    public final void setThemePreference(EnumPreference<Theme> enumPreference) {
        Intrinsics.checkNotNullParameter(enumPreference, "<set-?>");
        this.themePreference = enumPreference;
    }

    public final ColorSchemeManager getColorSchemeManager() {
        ColorSchemeManager colorSchemeManager = this.colorSchemeManager;
        if (colorSchemeManager != null) {
            return colorSchemeManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("colorSchemeManager");
        return null;
    }

    public final void setColorSchemeManager(ColorSchemeManager colorSchemeManager) {
        Intrinsics.checkNotNullParameter(colorSchemeManager, "<set-?>");
        this.colorSchemeManager = colorSchemeManager;
    }

    private final AppearancePreferencesCallbacks getCallbacks() {
        return (AppearancePreferencesCallbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenName() {
        return "AppAppearancePreferences";
    }

    private final ToolbarScrollAnimator getToolbarScrollAnimator() {
        return (ToolbarScrollAnimator) this.toolbarScrollAnimator.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ToolbarScrollAnimator toolbarScrollAnimator_delegate$lambda$0(AppearancePreferencesFragment appearancePreferencesFragment) {
        RhToolbar rhToolbar = appearancePreferencesFragment.getRhToolbar();
        Intrinsics.checkNotNull(rhToolbar);
        return new ToolbarScrollAnimator(rhToolbar, appearancePreferencesFragment.getResources().getDimension(C11048R.dimen.toolbar_scroll_height), false, false, false, (Float) null, 52, (DefaultConstructorMarker) null);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, getThemePreference().getChanges(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.settings.ui.preferences.AppearancePreferencesFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AppearancePreferencesFragment.onStart$lambda$4(this.f$0, (Theme) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, getColorSchemeManager().getChanges(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.settings.ui.preferences.AppearancePreferencesFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AppearancePreferencesFragment.onStart$lambda$5(this.f$0, (Tuples2) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, getBinding().accessibleColorsToggle.checkedChanges(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.settings.ui.preferences.AppearancePreferencesFragment$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AppearancePreferencesFragment.onStart$lambda$6(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$4(final AppearancePreferencesFragment appearancePreferencesFragment, final Theme theme) {
        Intrinsics.checkNotNullParameter(theme, "theme");
        AnalyticsLogger.DefaultImpls.logButtonGroupAppear$default(appearancePreferencesFragment.getAnalytics(), AnalyticsStrings.BUTTON_GROUP_APP_APPEARANCE_SETTINGS, AnalyticsStrings.BUTTON_THEME_SETTINGS, AppearancePreferencesFragment3.getAnalyticsString(theme), null, null, null, AppearancePreferencesFragment3.getAnalyticsString(theme), null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE, null);
        RdsRowView rdsRowView = appearancePreferencesFragment.getBinding().themePreferenceRow;
        rdsRowView.setSecondaryText(appearancePreferencesFragment.getString(AppearancePreferencesFragment3.getLabelResId(theme)));
        Intrinsics.checkNotNull(rdsRowView);
        OnClickListeners.onClick(rdsRowView, new Function0() { // from class: com.robinhood.android.settings.ui.preferences.AppearancePreferencesFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AppearancePreferencesFragment.onStart$lambda$4$lambda$3$lambda$2(this.f$0, theme);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$4$lambda$3$lambda$2(AppearancePreferencesFragment appearancePreferencesFragment, Theme theme) {
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(appearancePreferencesFragment.getAnalytics(), AnalyticsStrings.BUTTON_GROUP_APP_APPEARANCE_SETTINGS, AnalyticsStrings.BUTTON_THEME_SETTINGS, AppearancePreferencesFragment3.getAnalyticsString(theme), null, null, null, AppearancePreferencesFragment3.getAnalyticsString(theme), null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE, null);
        appearancePreferencesFragment.getCallbacks().onThemePreferenceClicked();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$5(AppearancePreferencesFragment appearancePreferencesFragment, Tuples2 tuples2) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        ColorScheme colorScheme = (ColorScheme) tuples2.component1();
        appearancePreferencesFragment.getBinding().accessibleColorsToggle.setCheckedProgrammatically(colorScheme.isAccessibleAlternate());
        AnalyticsLogger.DefaultImpls.logButtonGroupAppear$default(appearancePreferencesFragment.getAnalytics(), AnalyticsStrings.BUTTON_GROUP_APP_APPEARANCE_SETTINGS, AnalyticsStrings.BUTTON_ACCESSIBLE_COLORS, AppearancePreferencesFragment3.getAnalyticsString(colorScheme), null, null, null, AppearancePreferencesFragment3.getAnalyticsString(colorScheme), null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$6(AppearancePreferencesFragment appearancePreferencesFragment, boolean z) {
        ColorScheme colorScheme = z ? ColorScheme.ALTERNATE : ColorScheme.STANDARD;
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(appearancePreferencesFragment.getAnalytics(), AnalyticsStrings.BUTTON_GROUP_APP_APPEARANCE_SETTINGS, AnalyticsStrings.BUTTON_ACCESSIBLE_COLORS, AppearancePreferencesFragment3.getAnalyticsString(colorScheme), null, null, null, AppearancePreferencesFragment3.getAnalyticsString(colorScheme), null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE, null);
        appearancePreferencesFragment.getColorSchemeManager().setColorScheme(colorScheme);
        appearancePreferencesFragment.getBinding().appearanceVisualizationView.accelerateToNegativeState();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        ToolbarScrollAnimator toolbarScrollAnimator = getToolbarScrollAnimator();
        NestedScrollView scrollView = getBinding().scrollView;
        Intrinsics.checkNotNullExpressionValue(scrollView, "scrollView");
        toolbarScrollAnimator.dispatchScroll(scrollView);
        ToolbarScrollAnimator toolbarScrollAnimator2 = getToolbarScrollAnimator();
        NestedScrollView scrollView2 = getBinding().scrollView;
        Intrinsics.checkNotNullExpressionValue(scrollView2, "scrollView");
        toolbarScrollAnimator2.subscribe(scrollView2, this);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setTitle(getString(C28315R.string.setting_appearances_preferences_label));
        toolbar.setElevation(0.0f);
    }

    /* compiled from: AppearancePreferencesFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/preferences/AppearancePreferencesFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverCompanion;", "Lcom/robinhood/android/settings/ui/preferences/AppearancePreferencesFragment;", "Lcom/robinhood/shared/settings/contracts/AppearancePreferencesFragmentKey;", "<init>", "()V", "feature-settings_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverCompanion<AppearancePreferencesFragment, AppearancePreferencesFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(AppearancePreferencesFragmentKey appearancePreferencesFragmentKey) {
            return FragmentResolverCompanion.DefaultImpls.createFragment(this, appearancePreferencesFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public /* bridge */ /* synthetic */ Parcelable getArgs(Fragment fragment) {
            return (Parcelable) getArgs((AppearancePreferencesFragment) fragment);
        }

        public Void getArgs(AppearancePreferencesFragment appearancePreferencesFragment) {
            return FragmentResolverCompanion.DefaultImpls.getArgs(this, appearancePreferencesFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCreator
        public AppearancePreferencesFragment newInstance() {
            return (AppearancePreferencesFragment) FragmentResolverCompanion.DefaultImpls.newInstance(this);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCreator
        public AppearancePreferencesFragment newInstance(Void r1) {
            return (AppearancePreferencesFragment) FragmentResolverCompanion.DefaultImpls.newInstance(this, r1);
        }
    }
}
