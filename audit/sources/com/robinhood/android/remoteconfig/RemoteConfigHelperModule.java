package com.robinhood.android.remoteconfig;

import android.content.Context;
import android.content.SharedPreferences;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.annotation.UserPrefs;
import com.robinhood.utils.remoteconfig.RemoteConfigHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RemoteConfigHelperModule.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\tH\u0007J\u0012\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/remoteconfig/RemoteConfigHelperModule;", "", "<init>", "()V", "bindRemoteConfigHelper", "Lcom/robinhood/utils/remoteconfig/RemoteConfigHelper;", "context", "Landroid/content/Context;", "remoteConfigStalePref", "Lcom/robinhood/prefs/BooleanPreference;", "provideRemoteConfigStalePref", "preferences", "Landroid/content/SharedPreferences;", "lib-remoteconfig_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class RemoteConfigHelperModule {
    public final RemoteConfigHelper bindRemoteConfigHelper(Context context, @RemoteConfigStale BooleanPreference remoteConfigStalePref) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(remoteConfigStalePref, "remoteConfigStalePref");
        return new RealRemoteConfigHelper(context, remoteConfigStalePref);
    }

    @RemoteConfigStale
    public final BooleanPreference provideRemoteConfigStalePref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new BooleanPreference(preferences, "isRemoteConfigStale", false, null, 8, null);
    }
}
