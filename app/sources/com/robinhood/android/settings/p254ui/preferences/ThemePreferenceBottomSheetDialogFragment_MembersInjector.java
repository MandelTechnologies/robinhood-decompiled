package com.robinhood.android.settings.p254ui.preferences;

import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment_MembersInjector;
import com.robinhood.android.common.p088ui.BaseDialogFragment_MembersInjector;
import com.robinhood.android.common.p088ui.daynight.NightModeManager;
import com.robinhood.android.common.p088ui.p089di.BaseDialogSingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.designsystem.prefs.Theme;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.prefs.EnumPreference;
import com.robinhood.shared.app.type.AppType;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ThemePreferenceBottomSheetDialogFragment_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017Bf\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\u0017\u0010\n\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\b\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\n\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\b\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/preferences/ThemePreferenceBottomSheetDialogFragment_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/settings/ui/preferences/ThemePreferenceBottomSheetDialogFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseDialogSingletons;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "currentThemePref", "Lcom/robinhood/prefs/EnumPreference;", "Lcom/robinhood/android/designsystem/prefs/Theme;", "Lkotlin/jvm/JvmSuppressWildcards;", "nightModeManager", "Lcom/robinhood/android/common/ui/daynight/NightModeManager;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-settings_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class ThemePreferenceBottomSheetDialogFragment_MembersInjector implements MembersInjector<ThemePreferenceBottomSheetDialogFragment> {
    private final Provider<AnalyticsLogger> analytics;
    private final Provider<AppType> appType;
    private final Provider<EnumPreference<Theme>> currentThemePref;
    private final Provider<Navigator> navigator;
    private final Provider<NightModeManager> nightModeManager;
    private final Provider<BaseDialogSingletons> singletons;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<ThemePreferenceBottomSheetDialogFragment> create(Provider<BaseDialogSingletons> provider, Provider<Navigator> provider2, Provider<AnalyticsLogger> provider3, Provider<EnumPreference<Theme>> provider4, Provider<NightModeManager> provider5, Provider<AppType> provider6) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @JvmStatic
    public static final void injectAnalytics(ThemePreferenceBottomSheetDialogFragment themePreferenceBottomSheetDialogFragment, AnalyticsLogger analyticsLogger) {
        INSTANCE.injectAnalytics(themePreferenceBottomSheetDialogFragment, analyticsLogger);
    }

    @JvmStatic
    public static final void injectAppType(ThemePreferenceBottomSheetDialogFragment themePreferenceBottomSheetDialogFragment, AppType appType) {
        INSTANCE.injectAppType(themePreferenceBottomSheetDialogFragment, appType);
    }

    @JvmStatic
    public static final void injectCurrentThemePref(ThemePreferenceBottomSheetDialogFragment themePreferenceBottomSheetDialogFragment, EnumPreference<Theme> enumPreference) {
        INSTANCE.injectCurrentThemePref(themePreferenceBottomSheetDialogFragment, enumPreference);
    }

    @JvmStatic
    public static final void injectNightModeManager(ThemePreferenceBottomSheetDialogFragment themePreferenceBottomSheetDialogFragment, NightModeManager nightModeManager) {
        INSTANCE.injectNightModeManager(themePreferenceBottomSheetDialogFragment, nightModeManager);
    }

    public ThemePreferenceBottomSheetDialogFragment_MembersInjector(Provider<BaseDialogSingletons> singletons, Provider<Navigator> navigator, Provider<AnalyticsLogger> analytics, Provider<EnumPreference<Theme>> currentThemePref, Provider<NightModeManager> nightModeManager, Provider<AppType> appType) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(currentThemePref, "currentThemePref");
        Intrinsics.checkNotNullParameter(nightModeManager, "nightModeManager");
        Intrinsics.checkNotNullParameter(appType, "appType");
        this.singletons = singletons;
        this.navigator = navigator;
        this.analytics = analytics;
        this.currentThemePref = currentThemePref;
        this.nightModeManager = nightModeManager;
        this.appType = appType;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(ThemePreferenceBottomSheetDialogFragment instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseDialogFragment_MembersInjector.Companion companion = BaseDialogFragment_MembersInjector.INSTANCE;
        BaseDialogSingletons baseDialogSingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseDialogSingletons, "get(...)");
        companion.injectSingletons(instance, baseDialogSingletons);
        BaseBottomSheetDialogFragment_MembersInjector.Companion companion2 = BaseBottomSheetDialogFragment_MembersInjector.INSTANCE;
        Navigator navigator = this.navigator.get();
        Intrinsics.checkNotNullExpressionValue(navigator, "get(...)");
        companion2.injectNavigator(instance, navigator);
        Companion companion3 = INSTANCE;
        AnalyticsLogger analyticsLogger = this.analytics.get();
        Intrinsics.checkNotNullExpressionValue(analyticsLogger, "get(...)");
        companion3.injectAnalytics(instance, analyticsLogger);
        EnumPreference<Theme> enumPreference = this.currentThemePref.get();
        Intrinsics.checkNotNullExpressionValue(enumPreference, "get(...)");
        companion3.injectCurrentThemePref(instance, enumPreference);
        NightModeManager nightModeManager = this.nightModeManager.get();
        Intrinsics.checkNotNullExpressionValue(nightModeManager, "get(...)");
        companion3.injectNightModeManager(instance, nightModeManager);
        AppType appType = this.appType.get();
        Intrinsics.checkNotNullExpressionValue(appType, "get(...)");
        companion3.injectAppType(instance, appType);
    }

    /* compiled from: ThemePreferenceBottomSheetDialogFragment_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jm\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\u0017\u0010\u000e\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0002\b\u00110\b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\bH\u0007J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007J#\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00062\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0002\b\u0011H\u0007J\u0018\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J\u0018\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0015H\u0007¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/preferences/ThemePreferenceBottomSheetDialogFragment_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/settings/ui/preferences/ThemePreferenceBottomSheetDialogFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseDialogSingletons;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "currentThemePref", "Lcom/robinhood/prefs/EnumPreference;", "Lcom/robinhood/android/designsystem/prefs/Theme;", "Lkotlin/jvm/JvmSuppressWildcards;", "nightModeManager", "Lcom/robinhood/android/common/ui/daynight/NightModeManager;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "injectAnalytics", "", "instance", "injectCurrentThemePref", "injectNightModeManager", "injectAppType", "feature-settings_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<ThemePreferenceBottomSheetDialogFragment> create(Provider<BaseDialogSingletons> singletons, Provider<Navigator> navigator, Provider<AnalyticsLogger> analytics, Provider<EnumPreference<Theme>> currentThemePref, Provider<NightModeManager> nightModeManager, Provider<AppType> appType) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            Intrinsics.checkNotNullParameter(currentThemePref, "currentThemePref");
            Intrinsics.checkNotNullParameter(nightModeManager, "nightModeManager");
            Intrinsics.checkNotNullParameter(appType, "appType");
            return new ThemePreferenceBottomSheetDialogFragment_MembersInjector(singletons, navigator, analytics, currentThemePref, nightModeManager, appType);
        }

        @JvmStatic
        public final void injectAnalytics(ThemePreferenceBottomSheetDialogFragment instance, AnalyticsLogger analytics) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            instance.setAnalytics(analytics);
        }

        @JvmStatic
        public final void injectCurrentThemePref(ThemePreferenceBottomSheetDialogFragment instance, EnumPreference<Theme> currentThemePref) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(currentThemePref, "currentThemePref");
            instance.setCurrentThemePref(currentThemePref);
        }

        @JvmStatic
        public final void injectNightModeManager(ThemePreferenceBottomSheetDialogFragment instance, NightModeManager nightModeManager) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(nightModeManager, "nightModeManager");
            instance.setNightModeManager(nightModeManager);
        }

        @JvmStatic
        public final void injectAppType(ThemePreferenceBottomSheetDialogFragment instance, AppType appType) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(appType, "appType");
            instance.setAppType(appType);
        }
    }
}
