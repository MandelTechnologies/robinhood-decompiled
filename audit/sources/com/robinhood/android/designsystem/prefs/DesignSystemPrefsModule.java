package com.robinhood.android.designsystem.prefs;

import android.content.SharedPreferences;
import com.robinhood.android.designsystem.style.ColorScheme;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.EnumPreference;
import com.robinhood.prefs.annotation.DevicePrefs;
import com.robinhood.prefs.annotation.UserPrefs;
import com.robinhood.shared.app.type.AppType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DesignSystemPrefsModule.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\b\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J \u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\n2\b\b\u0001\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000fH\u0007¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/designsystem/prefs/DesignSystemPrefsModule;", "", "<init>", "()V", "provideIsInRebrandPref", "Lcom/robinhood/prefs/BooleanPreference;", "preferences", "Landroid/content/SharedPreferences;", "provideIsHomeV2EnabledPref", "provideColorSchemePref", "Lcom/robinhood/prefs/EnumPreference;", "Lcom/robinhood/android/designsystem/style/ColorScheme;", "provideThemePref", "Lcom/robinhood/android/designsystem/prefs/Theme;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class DesignSystemPrefsModule {
    public static final DesignSystemPrefsModule INSTANCE = new DesignSystemPrefsModule();

    private DesignSystemPrefsModule() {
    }

    @IsInRebrandPref
    public final BooleanPreference provideIsInRebrandPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new BooleanPreference(preferences, "rebrand_isInRebrand", false, null, 12, null);
    }

    @HomeV2Pref
    public final BooleanPreference provideIsHomeV2EnabledPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new BooleanPreference(preferences, "home_v2_enabled", false, null, 12, null);
    }

    public final EnumPreference<ColorScheme> provideColorSchemePref(@DevicePrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new EnumPreference<>(ColorScheme.class, preferences, "designSystemColorScheme", ColorScheme.STANDARD, null, 16, null);
    }

    public final EnumPreference<Theme> provideThemePref(@DevicePrefs SharedPreferences preferences, AppType appType) {
        Theme theme;
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(appType, "appType");
        if (appType == AppType.RHC) {
            theme = Theme.SYSTEM;
        } else {
            theme = Theme.MARKET;
        }
        return new EnumPreference<>(Theme.class, preferences, "theme_pref", theme, null, 16, null);
    }
}
