package com.robinhood.android.settings.p254ui.preferences;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.designsystem.prefs.Theme;
import com.robinhood.android.designsystem.style.ColorScheme;
import com.robinhood.android.settings.C28315R;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: AppearancePreferencesFragment.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0018\u0010\u0005\u001a\u00020\u0006*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\"\u0018\u0010\u0005\u001a\u00020\u0006*\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\n¨\u0006\u000b"}, m3636d2 = {"labelResId", "", "Lcom/robinhood/android/designsystem/prefs/Theme;", "getLabelResId", "(Lcom/robinhood/android/designsystem/prefs/Theme;)I", "analyticsString", "", "getAnalyticsString", "(Lcom/robinhood/android/designsystem/prefs/Theme;)Ljava/lang/String;", "Lcom/robinhood/android/designsystem/style/ColorScheme;", "(Lcom/robinhood/android/designsystem/style/ColorScheme;)Ljava/lang/String;", "feature-settings_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.settings.ui.preferences.AppearancePreferencesFragmentKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class AppearancePreferencesFragment3 {

    /* compiled from: AppearancePreferencesFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.settings.ui.preferences.AppearancePreferencesFragmentKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

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
            int[] iArr2 = new int[ColorScheme.values().length];
            try {
                iArr2[ColorScheme.STANDARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ColorScheme.ALTERNATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getLabelResId(Theme theme) {
        int i = WhenMappings.$EnumSwitchMapping$0[theme.ordinal()];
        if (i == 1) {
            return C28315R.string.theme_preference_market;
        }
        if (i == 2) {
            return C28315R.string.theme_preference_system;
        }
        if (i == 3) {
            return C28315R.string.theme_preference_day;
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return C28315R.string.theme_preference_night;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getAnalyticsString(Theme theme) {
        int i = WhenMappings.$EnumSwitchMapping$0[theme.ordinal()];
        if (i == 1) {
            return "market_hours";
        }
        if (i == 2) {
            return "system";
        }
        if (i == 3) {
            return "light";
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return "dark";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getAnalyticsString(ColorScheme colorScheme) {
        int i = WhenMappings.$EnumSwitchMapping$1[colorScheme.ordinal()];
        if (i == 1) {
            return AnalyticsStrings.BUTTON_ACCESSIBLE_COLORS_DEFAULT;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return AnalyticsStrings.BUTTON_ACCESSIBLE_COLORS_RED_GREEN_COLORBLIND;
    }
}
