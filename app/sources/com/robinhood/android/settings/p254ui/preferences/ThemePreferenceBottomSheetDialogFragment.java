package com.robinhood.android.settings.p254ui.preferences;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.DialogFragment;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.daynight.NightModeManager;
import com.robinhood.android.common.util.UiCallbacks;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.designsystem.prefs.Theme;
import com.robinhood.android.designsystem.selectioncontrol.LegacyRdsRadioButton;
import com.robinhood.android.designsystem.selectioncontrol.LegacyRdsRadioGroup;
import com.robinhood.android.navigation.DialogFragmentResolver;
import com.robinhood.android.settings.C28315R;
import com.robinhood.android.settings.databinding.FragmentThemePreferenceBinding;
import com.robinhood.prefs.EnumPreference;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.settings.contracts.ThemePreferenceBottomSheetDialogFragmentKey;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: ThemePreferenceBottomSheetDialogFragment.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u0000 52\u00020\u00012\u00020\u0002:\u00015B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0016J\u001a\u0010(\u001a\u00020%2\u0006\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\u0010\u0010-\u001a\u00020%2\u0006\u0010.\u001a\u00020/H\u0002J\u0010\u00100\u001a\u00020%2\u0006\u00101\u001a\u00020\rH\u0002R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0018\u001a\u00020\u00198\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001b\u0010\u001e\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b \u0010!R\u0014\u00102\u001a\u00020/8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u00104¨\u00066"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/preferences/ThemePreferenceBottomSheetDialogFragment;", "Lcom/robinhood/android/common/ui/BaseBottomSheetDialogFragment;", "Lcom/robinhood/android/common/util/UiCallbacks$ScreenViewAnalyticable;", "<init>", "()V", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalytics", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "currentThemePref", "Lcom/robinhood/prefs/EnumPreference;", "Lcom/robinhood/android/designsystem/prefs/Theme;", "getCurrentThemePref", "()Lcom/robinhood/prefs/EnumPreference;", "setCurrentThemePref", "(Lcom/robinhood/prefs/EnumPreference;)V", "nightModeManager", "Lcom/robinhood/android/common/ui/daynight/NightModeManager;", "getNightModeManager", "()Lcom/robinhood/android/common/ui/daynight/NightModeManager;", "setNightModeManager", "(Lcom/robinhood/android/common/ui/daynight/NightModeManager;)V", "appType", "Lcom/robinhood/shared/app/type/AppType;", "getAppType", "()Lcom/robinhood/shared/app/type/AppType;", "setAppType", "(Lcom/robinhood/shared/app/type/AppType;)V", "binding", "Lcom/robinhood/android/settings/databinding/FragmentThemePreferenceBinding;", "getBinding", "()Lcom/robinhood/android/settings/databinding/FragmentThemePreferenceBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "onAttach", "", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "analyticsLogRadioButton", "description", "", "setTheme", "newTheme", "screenName", "getScreenName", "()Ljava/lang/String;", "Companion", "feature-settings_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class ThemePreferenceBottomSheetDialogFragment extends BaseBottomSheetDialogFragment implements UiCallbacks.ScreenViewAnalyticable {
    public static final String SCREEN_NAME = "ThemePreference";
    public AnalyticsLogger analytics;
    public AppType appType;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    public EnumPreference<Theme> currentThemePref;
    public NightModeManager nightModeManager;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(ThemePreferenceBottomSheetDialogFragment.class, "binding", "getBinding()Lcom/robinhood/android/settings/databinding/FragmentThemePreferenceBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: ThemePreferenceBottomSheetDialogFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Theme.values().length];
            try {
                iArr[Theme.MARKET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Theme.SYSTEM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Theme.DAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Theme.NIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ThemePreferenceBottomSheetDialogFragment() {
        super(C28315R.layout.fragment_theme_preference);
        this.binding = ViewBinding5.viewBinding(this, ThemePreferenceBottomSheetDialogFragment2.INSTANCE);
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

    public final EnumPreference<Theme> getCurrentThemePref() {
        EnumPreference<Theme> enumPreference = this.currentThemePref;
        if (enumPreference != null) {
            return enumPreference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("currentThemePref");
        return null;
    }

    public final void setCurrentThemePref(EnumPreference<Theme> enumPreference) {
        Intrinsics.checkNotNullParameter(enumPreference, "<set-?>");
        this.currentThemePref = enumPreference;
    }

    public final NightModeManager getNightModeManager() {
        NightModeManager nightModeManager = this.nightModeManager;
        if (nightModeManager != null) {
            return nightModeManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("nightModeManager");
        return null;
    }

    public final void setNightModeManager(NightModeManager nightModeManager) {
        Intrinsics.checkNotNullParameter(nightModeManager, "<set-?>");
        this.nightModeManager = nightModeManager;
    }

    public final AppType getAppType() {
        AppType appType = this.appType;
        if (appType != null) {
            return appType;
        }
        Intrinsics.throwUninitializedPropertyAccessException("appType");
        return null;
    }

    public final void setAppType(AppType appType) {
        Intrinsics.checkNotNullParameter(appType, "<set-?>");
        this.appType = appType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentThemePreferenceBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentThemePreferenceBinding) value;
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, com.robinhood.hammer.android.fragment.HammerDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment, com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        int id;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (getNightModeManager().isSystemSettingAvailable()) {
            getBinding().themePreferenceSystem.setVisibility(0);
            getBinding().themePreferenceSystemDivider.setVisibility(0);
        } else {
            if (getCurrentThemePref().getValue() == Theme.SYSTEM) {
                getCurrentThemePref().setValue(getAppType() == AppType.RHC ? Theme.NIGHT : Theme.MARKET);
            }
            getBinding().themePreferenceSystem.setVisibility(8);
            getBinding().themePreferenceSystemDivider.setVisibility(8);
        }
        if (getAppType() == AppType.RHC) {
            getBinding().themePreferenceMarket.setVisibility(8);
            getBinding().themePreferenceMarketDivider.setVisibility(8);
            if (getCurrentThemePref().getValue() == Theme.MARKET) {
                if (getNightModeManager().isSystemSettingAvailable()) {
                    getCurrentThemePref().setValue(Theme.SYSTEM);
                } else {
                    getCurrentThemePref().setValue(Theme.NIGHT);
                }
            }
        } else {
            getBinding().themePreferenceMarket.setVisibility(0);
            getBinding().themePreferenceMarketDivider.setVisibility(0);
        }
        Iterator it = CollectionsKt.listOfNotNull((Object[]) new String[]{"market_hours", getNightModeManager().isSystemSettingAvailable() ? "system" : null, "light", "dark"}).iterator();
        while (it.hasNext()) {
            AnalyticsLogger.DefaultImpls.logButtonGroupAppear$default(getAnalytics(), "multi_choice_setting", AnalyticsStrings.BUTTON_THEME_SELECTION, (String) it.next(), null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, null);
        }
        LegacyRdsRadioGroup legacyRdsRadioGroup = getBinding().themePreference;
        int i = WhenMappings.$EnumSwitchMapping$0[((Theme) getCurrentThemePref().getValue()).ordinal()];
        if (i == 1) {
            id = getBinding().themePreferenceMarket.getId();
        } else if (i == 2) {
            id = getBinding().themePreferenceSystem.getId();
        } else if (i == 3) {
            id = getBinding().themePreferenceDay.getId();
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            id = getBinding().themePreferenceNight.getId();
        }
        legacyRdsRadioGroup.check(id);
        getBinding().themePreference.setOnCheckedChangeListener(new LegacyRdsRadioGroup.OnCheckedChangeListener() { // from class: com.robinhood.android.settings.ui.preferences.ThemePreferenceBottomSheetDialogFragment.onViewCreated.3
            @Override // com.robinhood.android.designsystem.selectioncontrol.LegacyRdsRadioGroup.OnCheckedChangeListener
            public void onCheckedChanged(LegacyRdsRadioGroup group, int checkedId) {
                Intrinsics.checkNotNullParameter(group, "group");
                if (checkedId == ThemePreferenceBottomSheetDialogFragment.this.getBinding().themePreferenceMarket.getId()) {
                    ThemePreferenceBottomSheetDialogFragment.this.setTheme(Theme.MARKET);
                    return;
                }
                if (checkedId == ThemePreferenceBottomSheetDialogFragment.this.getBinding().themePreferenceSystem.getId()) {
                    ThemePreferenceBottomSheetDialogFragment.this.setTheme(Theme.SYSTEM);
                } else if (checkedId == ThemePreferenceBottomSheetDialogFragment.this.getBinding().themePreferenceDay.getId()) {
                    ThemePreferenceBottomSheetDialogFragment.this.setTheme(Theme.DAY);
                } else if (checkedId == ThemePreferenceBottomSheetDialogFragment.this.getBinding().themePreferenceNight.getId()) {
                    ThemePreferenceBottomSheetDialogFragment.this.setTheme(Theme.NIGHT);
                }
            }
        });
        LegacyRdsRadioButton themePreferenceMarket = getBinding().themePreferenceMarket;
        Intrinsics.checkNotNullExpressionValue(themePreferenceMarket, "themePreferenceMarket");
        OnClickListeners.onClick(themePreferenceMarket, new Function0() { // from class: com.robinhood.android.settings.ui.preferences.ThemePreferenceBottomSheetDialogFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ThemePreferenceBottomSheetDialogFragment.onViewCreated$lambda$3(this.f$0);
            }
        });
        LegacyRdsRadioButton themePreferenceSystem = getBinding().themePreferenceSystem;
        Intrinsics.checkNotNullExpressionValue(themePreferenceSystem, "themePreferenceSystem");
        OnClickListeners.onClick(themePreferenceSystem, new Function0() { // from class: com.robinhood.android.settings.ui.preferences.ThemePreferenceBottomSheetDialogFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ThemePreferenceBottomSheetDialogFragment.onViewCreated$lambda$4(this.f$0);
            }
        });
        LegacyRdsRadioButton themePreferenceDay = getBinding().themePreferenceDay;
        Intrinsics.checkNotNullExpressionValue(themePreferenceDay, "themePreferenceDay");
        OnClickListeners.onClick(themePreferenceDay, new Function0() { // from class: com.robinhood.android.settings.ui.preferences.ThemePreferenceBottomSheetDialogFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ThemePreferenceBottomSheetDialogFragment.onViewCreated$lambda$5(this.f$0);
            }
        });
        LegacyRdsRadioButton themePreferenceNight = getBinding().themePreferenceNight;
        Intrinsics.checkNotNullExpressionValue(themePreferenceNight, "themePreferenceNight");
        OnClickListeners.onClick(themePreferenceNight, new Function0() { // from class: com.robinhood.android.settings.ui.preferences.ThemePreferenceBottomSheetDialogFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ThemePreferenceBottomSheetDialogFragment.onViewCreated$lambda$6(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$3(ThemePreferenceBottomSheetDialogFragment themePreferenceBottomSheetDialogFragment) {
        themePreferenceBottomSheetDialogFragment.analyticsLogRadioButton("market_hours");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$4(ThemePreferenceBottomSheetDialogFragment themePreferenceBottomSheetDialogFragment) {
        themePreferenceBottomSheetDialogFragment.analyticsLogRadioButton("system");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$5(ThemePreferenceBottomSheetDialogFragment themePreferenceBottomSheetDialogFragment) {
        themePreferenceBottomSheetDialogFragment.analyticsLogRadioButton("light");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$6(ThemePreferenceBottomSheetDialogFragment themePreferenceBottomSheetDialogFragment) {
        themePreferenceBottomSheetDialogFragment.analyticsLogRadioButton("dark");
        return Unit.INSTANCE;
    }

    private final void analyticsLogRadioButton(String description) {
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(getAnalytics(), "multi_choice_setting", AnalyticsStrings.BUTTON_THEME_SELECTION, description, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setTheme(Theme newTheme) {
        if (newTheme != getCurrentThemePref().getValue()) {
            getCurrentThemePref().setValue(newTheme);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenName() {
        return SCREEN_NAME;
    }

    /* compiled from: ThemePreferenceBottomSheetDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/preferences/ThemePreferenceBottomSheetDialogFragment$Companion;", "Lcom/robinhood/android/navigation/DialogFragmentResolver;", "Lcom/robinhood/shared/settings/contracts/ThemePreferenceBottomSheetDialogFragmentKey;", "<init>", "()V", "SCREEN_NAME", "", "createDialogFragment", "Landroidx/fragment/app/DialogFragment;", "key", "feature-settings_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DialogFragmentResolver<ThemePreferenceBottomSheetDialogFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.DialogFragmentResolver
        public DialogFragment createDialogFragment(ThemePreferenceBottomSheetDialogFragmentKey key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return new ThemePreferenceBottomSheetDialogFragment();
        }
    }
}
