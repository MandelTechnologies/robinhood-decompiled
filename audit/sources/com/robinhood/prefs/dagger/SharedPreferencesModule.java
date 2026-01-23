package com.robinhood.prefs.dagger;

import android.app.Application;
import android.content.SharedPreferences;
import com.robinhood.prefs.annotation.DevicePrefs;
import com.robinhood.prefs.annotation.UserPrefs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SharedPreferencesModule.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/prefs/dagger/SharedPreferencesModule;", "", "<init>", "()V", "USER_PREFS_NAME", "", "DEVICE_PREFS_NAME", "provideUserPreferences", "Landroid/content/SharedPreferences;", "app", "Landroid/app/Application;", "provideDevicePreferences", "lib-prefs_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class SharedPreferencesModule {
    public static final String DEVICE_PREFS_NAME = "devicePrefs";
    public static final SharedPreferencesModule INSTANCE = new SharedPreferencesModule();
    public static final String USER_PREFS_NAME = "userPrefs";

    private SharedPreferencesModule() {
    }

    @UserPrefs
    public final SharedPreferences provideUserPreferences(Application app) {
        Intrinsics.checkNotNullParameter(app, "app");
        SharedPreferences sharedPreferences = app.getSharedPreferences(USER_PREFS_NAME, 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        return sharedPreferences;
    }

    @DevicePrefs
    public final SharedPreferences provideDevicePreferences(Application app) {
        Intrinsics.checkNotNullParameter(app, "app");
        SharedPreferences sharedPreferences = app.getSharedPreferences(DEVICE_PREFS_NAME, 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        return sharedPreferences;
    }
}
