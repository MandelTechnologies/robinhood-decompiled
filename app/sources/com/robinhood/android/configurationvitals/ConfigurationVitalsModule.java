package com.robinhood.android.configurationvitals;

import android.content.SharedPreferences;
import android.os.Build;
import com.robinhood.models.api.ConfigurationVitals;
import com.robinhood.models.api.UnsupportedVersionContent;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.IntPreference;
import com.robinhood.prefs.LongPreference;
import com.robinhood.prefs.StringPreference;
import com.robinhood.prefs.annotation.DevicePrefs;
import com.robinhood.prefs.annotation.UserPrefs;
import com.robinhood.prefs.dagger.SharedPreferencesModule;
import com.robinhood.utils.lifecycle.ActivityLifecycleListener;
import com.robinhood.utils.moshi.LazyMoshi;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import dagger.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConfigurationVitalsModule.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0012\u0010\u000e\u001a\u00020\u000f2\b\b\u0001\u0010\u0010\u001a\u00020\tH\u0007J\u0012\u0010\u0011\u001a\u00020\u00122\b\b\u0001\u0010\u0010\u001a\u00020\tH\u0007J\u0012\u0010\u0013\u001a\u00020\u00142\b\b\u0001\u0010\u0010\u001a\u00020\tH\u0007J\u0012\u0010\u0015\u001a\u00020\u000f2\b\b\u0001\u0010\u0010\u001a\u00020\tH\u0007J\u0012\u0010\u0016\u001a\u00020\u00172\b\b\u0001\u0010\u0010\u001a\u00020\tH\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/configurationvitals/ConfigurationVitalsModule;", "", "<init>", "()V", "provideConfigurationVitalsPreference", "Lcom/robinhood/android/configurationvitals/ConfigurationVitalsPreference;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", SharedPreferencesModule.DEVICE_PREFS_NAME, "Landroid/content/SharedPreferences;", "provideConfigurationVitalsManagerActivityLifecycleListener", "Lcom/robinhood/utils/lifecycle/ActivityLifecycleListener;", "configurationVitalsManager", "Lcom/robinhood/android/configurationvitals/ConfigurationVitalsManager;", "provideLastVitalsDismissPref", "Lcom/robinhood/prefs/StringPreference;", "prefs", "provideLastClearCacheCreatedBeforeTimestampPref", "Lcom/robinhood/prefs/LongPreference;", "provideDebugVitalsEnabledPref", "Lcom/robinhood/prefs/BooleanPreference;", "provideDebugVitalsAppVersionPref", "provideDebugVitalsOsVersionPref", "Lcom/robinhood/prefs/IntPreference;", "lib-configuration-vitals_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class ConfigurationVitalsModule {
    public static final ConfigurationVitalsModule INSTANCE = new ConfigurationVitalsModule();

    public final ActivityLifecycleListener provideConfigurationVitalsManagerActivityLifecycleListener(ConfigurationVitalsManager configurationVitalsManager) {
        Intrinsics.checkNotNullParameter(configurationVitalsManager, "configurationVitalsManager");
        return configurationVitalsManager;
    }

    private ConfigurationVitalsModule() {
    }

    public final ConfigurationVitalsPreference provideConfigurationVitalsPreference(final LazyMoshi moshi, @DevicePrefs SharedPreferences devicePrefs) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(devicePrefs, "devicePrefs");
        return new ConfigurationVitalsPreference(new LazyMoshi(new Lazy() { // from class: com.robinhood.android.configurationvitals.ConfigurationVitalsModule.provideConfigurationVitalsPreference.1
            @Override // dagger.Lazy
            public final Moshi get() {
                return moshi.get().newBuilder().add((JsonAdapter.Factory) UnsupportedVersionContent.Button.Action.INSTANCE.getJsonAdapterFactory()).build();
            }
        }).adapter(ConfigurationVitals.class), new StringPreference(devicePrefs, "configurationVitalsV3", null, null, 12, null));
    }

    @LastVitalsDismissPref
    public final StringPreference provideLastVitalsDismissPref(@UserPrefs SharedPreferences prefs) {
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        return new StringPreference(prefs, "lastVitalsDismissPref", null, null, 12, null);
    }

    @LastClearCacheCreatedBeforeTimestamp
    public final LongPreference provideLastClearCacheCreatedBeforeTimestampPref(@UserPrefs SharedPreferences prefs) {
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        return new LongPreference(prefs, "lastClearCacheCreatedBeforeTimestampPref", 0L, 4, null);
    }

    @VitalsDebugPrefs2
    public final BooleanPreference provideDebugVitalsEnabledPref(@DevicePrefs SharedPreferences prefs) {
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        return new BooleanPreference(prefs, "debugVitalsEnabledPref", false, null, 12, null);
    }

    @VitalsDebugPrefs
    public final StringPreference provideDebugVitalsAppVersionPref(@DevicePrefs SharedPreferences prefs) {
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        return new StringPreference(prefs, "debugVitalsAppVersionPref", null, null, 12, null);
    }

    @VitalsDebugPrefs3
    public final IntPreference provideDebugVitalsOsVersionPref(@DevicePrefs SharedPreferences prefs) {
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        return new IntPreference(prefs, "debugVitalsOsVersionPref", Build.VERSION.SDK_INT);
    }
}
