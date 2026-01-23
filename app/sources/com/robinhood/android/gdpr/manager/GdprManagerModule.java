package com.robinhood.android.gdpr.manager;

import android.content.SharedPreferences;
import com.robinhood.android.gdpr.GdprConsentStatus;
import com.robinhood.android.gdpr.manager.annotation.GdprFunctionalConsentPref;
import com.robinhood.android.gdpr.manager.annotation.GdprLastUpdatedConsentPref;
import com.robinhood.android.gdpr.manager.annotation.GdprMarketingConsentPref;
import com.robinhood.android.gdpr.manager.annotation.GdprPerformanceConsentPref;
import com.robinhood.android.util.login.UserLifecycleListener;
import com.robinhood.prefs.EnumPreference;
import com.robinhood.prefs.StringPreference;
import com.robinhood.prefs.annotation.DevicePrefs;
import com.robinhood.utils.lifecycle.ActivityLifecycleListener;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GdprManagerModule.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0007J\u0012\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0007¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/gdpr/manager/GdprManagerModule;", "", "<init>", "()V", "providesFunctionalConsentPref", "Lcom/robinhood/prefs/EnumPreference;", "Lcom/robinhood/android/gdpr/GdprConsentStatus;", "sharedPreferences", "Landroid/content/SharedPreferences;", "providesMarketingConsentPref", "providesPerformanceConsentPref", "providesLastUpdatedConsentPref", "Lcom/robinhood/prefs/StringPreference;", "provideActivityLifecycleListener", "Lcom/robinhood/utils/lifecycle/ActivityLifecycleListener;", "gdprManager", "Lcom/robinhood/android/gdpr/manager/GdprManager;", "provideUserLifecycleListener", "Lcom/robinhood/android/util/login/UserLifecycleListener;", "userLifecycleListener", "Lcom/robinhood/android/gdpr/manager/GdprUserLifecycleListener;", "lib-gdpr-manager_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class GdprManagerModule {
    public static final GdprManagerModule INSTANCE = new GdprManagerModule();

    public final ActivityLifecycleListener provideActivityLifecycleListener(GdprManager gdprManager) {
        Intrinsics.checkNotNullParameter(gdprManager, "gdprManager");
        return gdprManager;
    }

    public final UserLifecycleListener provideUserLifecycleListener(GdprUserLifecycleListener userLifecycleListener) {
        Intrinsics.checkNotNullParameter(userLifecycleListener, "userLifecycleListener");
        return userLifecycleListener;
    }

    private GdprManagerModule() {
    }

    @GdprFunctionalConsentPref
    public final EnumPreference<GdprConsentStatus> providesFunctionalConsentPref(@DevicePrefs SharedPreferences sharedPreferences) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        return new EnumPreference<>(GdprConsentStatus.class, sharedPreferences, "gdpr_functionalConsent", GdprConsentStatus.UNKNOWN, null, 16, null);
    }

    @GdprMarketingConsentPref
    public final EnumPreference<GdprConsentStatus> providesMarketingConsentPref(@DevicePrefs SharedPreferences sharedPreferences) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        return new EnumPreference<>(GdprConsentStatus.class, sharedPreferences, "gdpr_marketingConsent", GdprConsentStatus.UNKNOWN, null, 16, null);
    }

    @GdprPerformanceConsentPref
    public final EnumPreference<GdprConsentStatus> providesPerformanceConsentPref(@DevicePrefs SharedPreferences sharedPreferences) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        return new EnumPreference<>(GdprConsentStatus.class, sharedPreferences, "gdpr_performanceConsent", GdprConsentStatus.UNKNOWN, null, 16, null);
    }

    @GdprLastUpdatedConsentPref
    public final StringPreference providesLastUpdatedConsentPref(@DevicePrefs SharedPreferences sharedPreferences) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        return new StringPreference(sharedPreferences, "gdpr_lastUpdatedConsent", null, null, 12, null);
    }
}
