package com.robinhood.shared.microgram.common.services;

import android.app.Application;
import android.content.SharedPreferences;
import com.robinhood.prefs.dagger.SharedPreferencesModule;
import com.robinhood.shared.microgram.common.services.prefs.MicrogramUserPrefs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MicrogramSharedPreferencesModule.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/microgram/common/services/MicrogramSharedPreferencesModule;", "", "<init>", "()V", "provideUserPreferences", "Landroid/content/SharedPreferences;", "app", "Landroid/app/Application;", "lib-common-services_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class MicrogramSharedPreferencesModule {
    public static final MicrogramSharedPreferencesModule INSTANCE = new MicrogramSharedPreferencesModule();

    private MicrogramSharedPreferencesModule() {
    }

    @MicrogramUserPrefs
    public final SharedPreferences provideUserPreferences(Application app) {
        Intrinsics.checkNotNullParameter(app, "app");
        SharedPreferences sharedPreferences = app.getSharedPreferences(SharedPreferencesModule.USER_PREFS_NAME, 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        return sharedPreferences;
    }
}
