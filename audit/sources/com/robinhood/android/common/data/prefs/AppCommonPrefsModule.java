package com.robinhood.android.common.data.prefs;

import android.content.SharedPreferences;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.StringPreference;
import com.robinhood.prefs.annotation.CompletedEducationLessonsPref;
import com.robinhood.prefs.annotation.DevicePrefs;
import com.robinhood.prefs.annotation.StartedEducationLessonsPref;
import com.robinhood.prefs.annotation.UserPrefs;
import com.robinhood.shared.security.auth.AuthManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.LocalDate;

/* compiled from: AppCommonPrefsModule.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\b\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\u0006\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rH\u0007J\u0012\u0010\u000e\u001a\u00020\n2\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\u000f\u001a\u00020\n2\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\u0010\u001a\u00020\n2\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\u0011\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\u0012\u001a\u00020\n2\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\u0013\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\u0014\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\u0015\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\u0016\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\u0017\u001a\u00020\n2\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/common/data/prefs/AppCommonPrefsModule;", "", "<init>", "()V", "provideCrashlyticsUserIdPref", "Lcom/robinhood/prefs/StringPreference;", "preferences", "Landroid/content/SharedPreferences;", "provideUserLeapUserIdPref", "provideShowInstantDepositNuxPref", "Lcom/robinhood/prefs/BooleanPreference;", "provideNewDevicePref", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "provideHasVisitedBrokerageWatchlistHomePref", "provideHasVisitedEquityDetailPref", "provideHasVisitedEquityTradeFlowPref", "provideReferredDataPref", "providesShowExtendedHoursChartPref", "provideVideoAutoplaySettingPref", "provideSnowflakesConfettiLastShownDatePref", "startedEducationLessonsPref", "completedEducationLessonsPref", "provideHasShownDirectIpoOnboarding", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class AppCommonPrefsModule {
    public static final int $stable = 0;
    public static final AppCommonPrefsModule INSTANCE = new AppCommonPrefsModule();

    private AppCommonPrefsModule() {
    }

    @CrashlyticsUserId
    public final StringPreference provideCrashlyticsUserIdPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new StringPreference(preferences, "crashlyticsUserId", null, null, 12, null);
    }

    @UserLeapUserId
    public final StringPreference provideUserLeapUserIdPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new StringPreference(preferences, "userLeapUserId", null, null, 12, null);
    }

    @ShowInstantDepositNuxPref
    public final BooleanPreference provideShowInstantDepositNuxPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new BooleanPreference(preferences, "showInstantDepositNux", false, null, 8, null);
    }

    @IsNewDevicePref
    public final BooleanPreference provideNewDevicePref(@DevicePrefs SharedPreferences preferences, AuthManager authManager) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        BooleanPreference booleanPreference = new BooleanPreference(preferences, "isNewDevice", true, null, 8, null);
        if (authManager.isLoggedIn()) {
            booleanPreference.set(false);
        }
        return booleanPreference;
    }

    @HasVisitedBrokerageWatchlistHomePref
    public final BooleanPreference provideHasVisitedBrokerageWatchlistHomePref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new BooleanPreference(preferences, "hasVisitedBrokerageWatchlistHome", false, null, 8, null);
    }

    @HasVisitedEquityDetailPref
    public final BooleanPreference provideHasVisitedEquityDetailPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new BooleanPreference(preferences, "hasVisitedEquityDetail", false, null, 8, null);
    }

    @HasVisitedEquityTradeFlowPref
    public final BooleanPreference provideHasVisitedEquityTradeFlowPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new BooleanPreference(preferences, "hasVisitedEquityTradeFlow", false, null, 8, null);
    }

    @ReferredDataPref
    public final StringPreference provideReferredDataPref(@DevicePrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new StringPreference(preferences, "referredData", null, null, 12, null);
    }

    @ShowExtendedHoursChartPref
    public final BooleanPreference providesShowExtendedHoursChartPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        BooleanPreference booleanPreference = new BooleanPreference(preferences, "showExtendedHours", false, null, 8, null);
        if (booleanPreference.isSet()) {
            booleanPreference.delete();
        }
        return new BooleanPreference(preferences, "showExtendedHours2", true, null, 8, null);
    }

    @VideoAutoplaySettingPref
    public final StringPreference provideVideoAutoplaySettingPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new StringPreference(preferences, "videoAutoplaySetting", VideoAutoplaySettingPref2.MOBILE_AND_WIFI.getValue(), null, 8, null);
    }

    @SnowflakesConfettiLastShownDatePref
    public final StringPreference provideSnowflakesConfettiLastShownDatePref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new StringPreference(preferences, "snowflakesConfettiLastShownDate", LocalDate.MIN.toString(), null, 8, null);
    }

    @StartedEducationLessonsPref
    public final StringPreference startedEducationLessonsPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new StringPreference(preferences, "startedEducationLessons", null, null, 12, null);
    }

    @CompletedEducationLessonsPref
    public final StringPreference completedEducationLessonsPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new StringPreference(preferences, "completedEducationLessons", null, null, 12, null);
    }

    @HasShownDirectIpoOnboarding
    public final BooleanPreference provideHasShownDirectIpoOnboarding(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new BooleanPreference(preferences, "hasShownDirectIpoOnboarding", false, null, 8, null);
    }
}
